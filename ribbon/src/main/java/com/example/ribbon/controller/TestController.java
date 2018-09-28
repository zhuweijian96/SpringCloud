package com.example.ribbon.controller;

import com.example.ribbon.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private TestService testService;

    @RequestMapping("hi")
    public String hi(){
        return testService.hi();
    }

    @RequestMapping("getConfig")
    public String getConfig(){
        return testService.getConfig();
    }

}
