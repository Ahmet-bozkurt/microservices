package com.ahmetbozkurt.microservices.limitsservice.controller;

import com.ahmetbozkurt.microservices.limitsservice.bean.Limits;
import com.ahmetbozkurt.microservices.limitsservice.configuration.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsController {

    @GetMapping("/limits")
    public Limits retrieveLimits(){
        return new Limits(1,1000);
    }

    @Autowired
    private Configuration configuration;

    @GetMapping("/limits-config")
    public Limits retrieveLimitsConfig(){
        return new Limits(configuration.getMinimum(), configuration.getMaximum());
    }
}
