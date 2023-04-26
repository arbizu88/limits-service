package com.caha.microservices.limitservice.controller;

import com.caha.microservices.limitservice.bean.Limits;
import com.caha.microservices.limitservice.configuration.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitServiceController {

    @Autowired
    private Configuration configuration;

    @GetMapping("/limits")
    public Limits retrieveLimits(){
        return new Limits(1, 1000);
    }

    @GetMapping("/limits-config")
    public Limits retrieveLimitsConfig(){
        return new Limits(configuration.getMinimum(), configuration.getMaximum());
    }
}
