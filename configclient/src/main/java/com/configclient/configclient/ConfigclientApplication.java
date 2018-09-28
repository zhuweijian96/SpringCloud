package com.configclient.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@EnableDiscoveryClient
@EnableEurekaClient
@RefreshScope
@RestController
@SpringBootApplication
public class ConfigclientApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigclientApplication.class, args);
    }

    @Value("${foo}")
    String foo;

    @Value("${server.port}")
    String port;
    @RequestMapping(value = "/getConfig")
    public String getConfig(){
        return foo+port;
    }

//    @Value("${spring.rabbitmq.port}")
//    String port;
//    @RequestMapping(value = "/port")
//    public String port(){
//        return port;
//    }
}
