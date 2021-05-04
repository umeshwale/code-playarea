# CORS 

Cross Origin Resource Sharing

    Cross Origin Resource Sharing is a security concept that allows 
    restricting the resources implemented in web browsers.
    
    For Example - 
        - MyAppService1 is a service running on port 8080 
        - UI running on same port will be able to access above service
        - MyConsumerService is a service running on port 9090.
        - MyConsumerService running on port 9090 will not be able to access
          MyAppService1 service running on port 8080  
        - To access this service from other origin we need handle CORS
        
    We need to do this using below 
        - RESTful web service should support the Cross-Origin resource sharing
        - RESTful web service application should allow accessing the APIs from 
        8080 port. 
        
    Enable CORS in controller method - 
        We need to set the origins for RESTful web service by using @CrossOrigin annotation 
        for the controller method. 
        This @CrossOrigin annotation supports specific REST API, and not for the entire 
        application. 
        
                @RequestMapping(value = "/products")
                @CrossOrigin(origins = "http://localhost:8080")
                
                public ResponseEntity<Object> getProduct() {
                   return null;
                }
                
    Global CORS Configuration
        We need to define the shown @Bean configuration to set the CORS configuration support
         globally to your Spring Boot application.
         
                @Bean
                public WebMvcConfigurer corsConfigurer() {
                   return new WebMvcConfigurerAdapter() {
                      @Override
                      public void addCorsMappings(CorsRegistry registry) {
                         registry.addMapping("/products").allowedOrigins("http://localhost:9000");
                      }    
                   };
                }
                
    To code to set the CORS configuration globally in main Spring Boot application is given below.
    
            package com.tutorialspoint.demo;
            
            import org.springframework.boot.SpringApplication;
            import org.springframework.boot.autoconfigure.SpringBootApplication;
            import org.springframework.context.annotation.Bean;
            import org.springframework.web.servlet.config.annotation.CorsRegistry;
            import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
            import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
            
            @SpringBootApplication
            public class DemoApplication {
               public static void main(String[] args) {
                  SpringApplication.run(DemoApplication.class, args);
               }
               @Bean
               public WebMvcConfigurer corsConfigurer() {
                  return new WebMvcConfigurerAdapter() {
                     @Override
                     public void addCorsMappings(CorsRegistry registry) {
                        registry.addMapping("/products").allowedOrigins("http://localhost:8080");
                     }
                  };
               }
            }
            
            
Cross-Origin Resource Sharing (CORS) is an HTTP-header based mechanism that allows a server 
to indicate any other origins (domain, scheme, or port) than its own from which a browser should permit 
loading of resources.

        Origins - http://localhost:9090
        scheme - defines the type of Internet service (most common is http) 
        host - defines the domain host (default host for http is www) domain - defines the Internet domain name (w3schools.com)
        port - defines the port number at the host 
    

