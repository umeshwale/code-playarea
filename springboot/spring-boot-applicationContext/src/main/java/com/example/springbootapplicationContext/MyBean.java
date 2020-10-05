package com.example.springbootapplicationContext;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class MyBean implements ApplicationContextAware {

    private String applicationId;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Set Application ID in MyBean");
        System.out.println(applicationContext.getId());
        applicationId = applicationContext.getId();
    }

    public String getApplicationId() {
       return applicationId;
    }
}
