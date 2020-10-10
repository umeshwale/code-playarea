package com.example.configgreetingservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingRestController {

    @Value("${message}")
    private String msg;

    @RequestMapping("/message")
    public String greeting() {
        return this.msg;
    }

}
