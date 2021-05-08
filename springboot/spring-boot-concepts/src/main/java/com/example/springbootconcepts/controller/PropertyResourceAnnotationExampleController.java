package com.example.springbootconcepts.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@PropertySource(value = "classpath:propertyresource.properties")
public class PropertyResourceAnnotationExampleController {

    @Value("${greeting}")
    String greetingMessage;

    @GetMapping("/greeting")
    public String greeting() {
        return greetingMessage;
    }
}
