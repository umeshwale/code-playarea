# Spring Cloud Config Client

- Add below dependency in POM.xml

        <dependency>
            <groupId>org.springframework.cloud</groupId>
            <artifactId>spring-cloud-starter-config</artifactId>
        </dependency>
        
- Add config server properties in bootstrap.properties as below 

        spring.application.name=greeting-service
        spring.cloud.config.uri=http://localhost:8888
        
        In the config server which is configured in the application.properties of config server should
        have properties file with name greeting-service
        Ex - https://github.com/umeshwale/springcloud-config-server/
        
- Property can be retrieved  using @Value annotation wherever we want to use.

- Please note config server should be running at port mentioned in bootstrap.properties file. 