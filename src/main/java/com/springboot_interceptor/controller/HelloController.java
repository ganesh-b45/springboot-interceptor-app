package com.springboot_interceptor.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
@RequestMapping("/interceptor")
public class HelloController {

    private static final Logger loger = Logger.getLogger(HelloController.class.getName());
    @GetMapping("/hello")
    public String sayHello() {
        loger.info("Hello from Interceptor path!");
        return "Hello from Interceptor path!";
    }
}
