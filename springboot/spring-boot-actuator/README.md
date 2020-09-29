# Spring Boot - Actuator

Spring Boot Actuator provides secured endpoints for monitoring and managing your Spring Boot application.
By default, all actuator endpoints are secured. 

Enabling Spring Boot Actuator: 

    To enable Spring Boot actuator endpoints to your Spring Boot application, 
    we need to add the Spring Boot Starter actuator dependency in our build configuration file.
    
        <dependency>
           <groupId>org.springframework.boot</groupId>
           <artifactId>spring-boot-starter-actuator</artifactId>
        </dependency>
    
Switch to a Different Server Port: 

    Spring Boot Actuator defaults to running on port 8080. By adding an application.properties file, you can override that setting. 
    
        server.port: 9000
        management.server.port: 9001
        management.server.address: 127.0.0.1
    
Some important Spring Boot Actuator endpoints are given below. You can enter them in your web browser and monitor your application behavior.
    
    /metrics:   To view the application metrics such as memory used, memory free, threads, classes, system uptime etc.
    /env    :	To view the list of Environment variables used in the application.
    /beans	:   To view the Spring beans and its types, scopes and dependency.
    /health	:   To view the application health
    /info	:   To view the information about the Spring Boot application.
    /trace	:   To view the list of Traces of your Rest endpoints. A  A 