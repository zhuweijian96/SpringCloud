package com.example.eurekaclient.controller;

import com.example.eurekaclient.model.ShopUser;
import com.example.eurekaclient.service.ShopUserService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerTest {

    @Value("${server.port}")
    private String port;

    @Autowired
    ShopUserService shopUserService;

    @HystrixCommand(fallbackMethod = "Error")
    @RequestMapping("hi")
    public String hi(){
        return port;
    }
    public String Error() {
        return "sorry,error!";
    }
//    @HystrixCommand(fallbackMethod = "Error")
    @RequestMapping("show")
    public ShopUser show(){
        return shopUserService.getById(1);
    }
}
