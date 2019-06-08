package com.qwerty.client1.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
@RefreshScope
public class TestController {

    @Value("${test}")
    private String config;

    @RequestMapping("/test")
    public String test() throws Exception{
        return config;
    }
}
