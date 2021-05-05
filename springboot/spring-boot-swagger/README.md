# Spring boot - Enabling swagger

Swagger2 is an open source project used to generate the REST API documents for RESTful web services. 
It provides a user interface to access our RESTful web services via the web browser.

Steps Followed to enable swagger:

    1. Created springboot application using start.spring.io with Web dependency
    2. Created simple RestController with sample GET & POST methods
    3. Included below swagger maven dependency in pom.xml
    
        <dependency>
           <groupId>io.springfox</groupId>
           <artifactId>springfox-swagger2</artifactId>
           <version>2.7.0</version>
        </dependency>
        <dependency>
           <groupId>io.springfox</groupId>
           <artifactId>springfox-swagger-ui</artifactId>
           <version>2.7.0</version>
        </dependency>
    
    4. Added @EnableSwagger2 annotation on main class
    5. Start server and verify on - http://localhost:8080/swagger-ui.html#/