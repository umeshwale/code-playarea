package com.example.springcloudconfigclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingRestController {

    @Value("${message}")
    public String msg;

    @RequestMapping("/message")
    public String getMessage() {
        return msg;
    }
}
