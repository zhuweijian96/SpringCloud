package com.example.feign.service;

import org.springframework.stereotype.Component;

@Component
public class TestServiceImpl implements TestService{
    @Override
    public String SayHi() {
        return "ERROR";
    }
}
