# Spring Boot Devtools

    Auto reload feature can be achieved in spring boot  using Spring Boot Devtools.
    
Enabling Dev Tools Module

    Add below maven dependency in pom.xml
    
    <dependencies>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-devtools</artifactId>
            <optional>true</optional>
        </dependency>
    </dependencies>
    
    And with this devtools is ready with auto reload feature. 
    
Enable/Disable Live reload:

    The spring-boot-devtools module includes an embedded LiveReload server that can be used 
    to trigger a browser refresh when a resource is changed.
    Precondition is that your browser should have supported extention for it. 
    You can find such browser extentions in this link.
    
    By default, live reload is enabled. 
    If you wish to disable this feature for some reason, then set spring.devtools.livereload.enabled property to false.
    
    application.properties
        spring.devtools.livereload.enabled  = false #Set false to disable live reload