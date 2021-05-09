# Spring-Boot Logging

Logging in spring boot is built in with many spring "starter" dependencies

        When we add spring-boot-starter-web dependency it also includes 
        spring-boot-starter-logging dependency which internally have spring-jcl dependency.
        
How to get Logger instance

        Logger logger = LoggerFactory.getLogger(SpringBootLoggerController.class);
        
When we implement below 
        
        import org.slf4j.Logger;
        import org.slf4j.LoggerFactory;
        import org.springframework.web.bind.annotation.RequestMapping;
        import org.springframework.web.bind.annotation.RestController;
        
        @RestController
        public class SpringBootLoggerController {
            Logger logger = LoggerFactory.getLogger(SpringBootLoggerController.class);
        
            @RequestMapping(value = "/log")
            public String getLogs() {
                logger.debug("DEBUG Logs");
                logger.trace("TRACE Logs");
                logger.info("INFO Logs");
                logger.error("ERROR Logs");
                logger.warn("WARN Logs");
                return "Logs will be displayed on console";
            }
        }

      It will give below output in console
        
        2021-05-09 14:49:39.778  INFO 14540 --- [nio-8080-exec-1] c.e.s.SpringBootLoggerController         : INFO Logs
        2021-05-09 14:49:39.778 ERROR 14540 --- [nio-8080-exec-1] c.e.s.SpringBootLoggerController         : ERROR Logs
        2021-05-09 14:49:39.778  WARN 14540 --- [nio-8080-exec-1] c.e.s.SpringBootLoggerController         : WARN Logs
        
      So as we see there are no trace & debug logs. 
      
      To get the trace logs we need to add below entry in application.properties
      
        logging.level.root=TRACE
        
      But when we add logging at root level it will show log of logs so we need to add package as below 
      
        logging.level.com.example=TRACE
        
      With above logging level it will display below console    
        
        2021-05-09 14:56:03.786 DEBUG 13236 --- [nio-8080-exec-2] c.e.s.SpringBootLoggerController         : DEBUG Logs
        2021-05-09 14:56:03.787 TRACE 13236 --- [nio-8080-exec-2] c.e.s.SpringBootLoggerController         : TRACE Logs
        2021-05-09 14:56:03.787  INFO 13236 --- [nio-8080-exec-2] c.e.s.SpringBootLoggerController         : INFO Logs
        2021-05-09 14:56:03.787 ERROR 13236 --- [nio-8080-exec-2] c.e.s.SpringBootLoggerController         : ERROR Logs
        2021-05-09 14:56:03.787  WARN 13236 --- [nio-8080-exec-2] c.e.s.SpringBootLoggerController         : WARN Logs
          
XML Configuration

        - Spring Boot looks for certain XML files in the class path
        - Names : Below names need to be added in classpath
            - logback-spring.xml
            - logback.xml
                      
Notes:
    
        - Spring boot logging is built-in with spring-boot-starter-web dependencies
        - LoggerFactory.getLogger() for Logger instance
        - Uses Logback by default
        - Configuration using 
            - Application property values
            - XML file with naming convention
            
            