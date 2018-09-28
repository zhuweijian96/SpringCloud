package com.example.eurekaclient.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerTest {

    @Value("${server.port}")
    private String port;

    @HystrixCommand(fallbackMethod = "hiError")
    @RequestMapping("hi")
    public String hi(){
        return port;
    }
    public String hiError() {
        return "sorry,error!";
    }
}
