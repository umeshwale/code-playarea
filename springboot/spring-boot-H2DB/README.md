# SpringBoot Application with H2 Database

What is H2 Database?

    H2 is one of the popular in-memory databases written in Java. 
    It can be embedded in Java applications or run in the client-server mode.
    Spring Boot provides excellent integration support for H2 using simple properties configuration.
    To make it more useful, H2 also provides a console view to maintain and interact with the database tables and data.
    
H2 Maven Dependency

    <dependency>
        <groupId>com.h2database</groupId>
        <artifactId>h2</artifactId>
        <scope>runtime</scope>
    </dependency>
    
    We also need to add JPA dependency.
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-data-jpa</artifactId>
    </dependency>
    
Enable H2 console
    
    In application.properties file, enable H2 console with below configurations - 
    
    # Enabling H2 Console
    spring.h2.console.enabled=true
     
    # Custom H2 Console URL
    spring.h2.console.path=/h2 
    
Accessing H2 console

    Start the spring boot application and access the console in browser with URL : 
    
    http://localhost:8080/h2 
    or if above URL is not configured then use default URL 
    http://localhost:8080/h2-console
    
Create schema and insert data on initialization

    We may want to initialize database with some fixed schema (DDL) and insert default data (DML) into tables before the application is ready is run business usecases.
    
    We can achieve this by putting sql files into resources folder (/src/main/resources/).
    
    schema.sql – To initialize the schema ie.create tables and dependencies.
    data.sql – To insert default data rows.
    
