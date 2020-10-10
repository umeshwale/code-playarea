# Spring Cloud Config Server 

- Add below maven dependency:

        <dependency>
            <groupId>org.springframework.cloud</groupId>
            <artifactId>spring-cloud-config-server</artifactId>
        </dependency>
        
- Add @EnableConfigServer annotation on main application class

        @SpringBootApplication
        @EnableConfigServer
        public class SpringCloudConfigServerApplication { ... }
        
- Update application.properties file to provide config files path

        Ex: Here we are pulling files from GIT Repo so path will be as below 
        
        spring.cloud.config.server.git.uri=https://github.com/umeshwale/springcloud-config-server
        
- How to verify config server URL ?

        Use URL as http://localhost:{port}/{config file name}/default
        Ex - http://localhost:8888/greeting-service/default
        