package com.example.ribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class TestService {

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "hiError")
    public String hi(){
        return restTemplate.getForObject("http://eureka-client/hi",String.class);
    }

    @HystrixCommand(fallbackMethod = "hiError")
    public String getConfig(){
        return restTemplate.getForObject("http://config-client/getConfig",String.class);
    }

    public String hiError(){
        return "ERROR";
    }
}
