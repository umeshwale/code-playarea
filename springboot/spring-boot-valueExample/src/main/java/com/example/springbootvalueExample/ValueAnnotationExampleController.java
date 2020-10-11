package com.example.springbootvalueExample;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class ValueAnnotationExampleController {
    @Value("This default Message")
    String defaultMessage;

    @Value("${my.greeting}")
    String message;


    @Value("#{'${my.list.values}'.split(',')}")
   List<String> listValues;

    @Value("#{${dbvalues}}")
    Map<String, String> dbValues;

    @Value("${no.value:No value hence default value}")
    String defValue;

    @RequestMapping("/value")
    public String valueReturn() {
        return defaultMessage + " - " + message + " - " + listValues + " - " + dbValues + " - " + defValue  ;
    }
}
