package com.test.controller;

import com.test.service.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class SampleController {
    @Autowired
    private service serviceq;

    @Value("${mockservice.url}")
    private String yamlContent;

    @RequestMapping("/")
    String home() {
        serviceq.sayHello();
        return yamlContent;
    }
}
