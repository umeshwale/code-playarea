# Spring Boot - CRUD using JPA

This application demo's Create, Retrieve, Update & Delete (CRUD) operations using REST APIs. 

Maven Dependency:
    
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-data-jpa</artifactId>
    </dependency>
    
    spring-boot-starter-data-jpa : It includes spring data, hibernate, HikariCP, JPA API, 
                                   JPA Implementation (default is hibernate), JDBC and other required libraries.
    
    <dependency>
        <groupId>com.h2database</groupId>
        <artifactId>h2</artifactId>
        <scope>runtime</scope>
    </dependency>
    h2 : Though we can add any database easily using datasource properties in application.properties file, 
         we are using h2 database in reduce unnecessacery complexity.

     
What is Spring Data JPA:

        Spring Data JPA API provides JpaTemplate class to integrate spring application with JPA. 
        JPA (Java Persistent API) is the sun specification for persisting objects in the enterprise application. 
        It is currently used as the replacement for complex entity beans.
        
Manual Custom Queries

         @Query("select firstName from Employee")
         List<String> getEmployeeFirstNames();