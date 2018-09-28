package com.example.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "eureka-client",fallback = TestServiceImpl.class)
public interface TestService {

    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String SayHi();
}
