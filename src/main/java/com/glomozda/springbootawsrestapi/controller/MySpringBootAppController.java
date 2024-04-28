package com.glomozda.springbootawsrestapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MySpringBootAppController {

    @GetMapping("/")
    public String hello() {
        return "Hello from Spring Boot on AWS Lambda!";
    }
}
