# @Component

@Component is an annotation that allows spring to automatically detect our custom bean.

It means that Spring framework will autodetect these classes for dependency injection 
when annotation-based configuration and classpath scanning is used.

In layman terms, a Component is responsible for some operations. 
Spring framework provides three other specific annotations to be used when marking a class as Component.
    
    @Service: 
        Denotes that the class provides some services. 
        Our utility classes can be marked as Service classes.
    
    @Repository: 
        This annotation indicates that the class deals with CRUD operations, 
        usually it’s used with DAO implementations that deal with database tables.
    
    @Controller: 
        Mostly used with web applications or REST web services to specify that the class 
        is a front controller and responsible to handle user request and return appropriate response.
    
    Note that all these four annotations are in package org.springframework.stereotype 
    and part of spring-context jar.
    
Example:

    import org.springframework.stereotype.Component;
    @Component
    public class TestComponentClass {
    
        public TestComponentClass() {
            System.out.println("No args constructor in component");
        }
    
        public int add(int x, int y) {
            System.out.println("In the add method");
            return x + y;
        }
    }

Now lets use it from main application class
    
    
    @SpringBootApplication
    public class SpringBootConceptsApplication {
    
        public static void main(String[] args) {
    
            ConfigurableApplicationContext ctx = SpringApplication
                    .run(SpringBootConceptsApplication.class, args);
            TestComponentClass testcomponent = ctx.getBean(TestComponentClass.class);
            int result = testcomponent.add(1,2);
            System.out.println("Addition of 1 and 2 = " + result);
        }
    
    }
    
Now when we start server we see below on console
           
      .   ____          _            __ _ _
     /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
    ( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
     \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
      '  |____| .__|_| |_|_| |_\__, | / / / /
     =========|_|==============|___/=/_/_/_/
     :: Spring Boot ::                (v2.4.5)
    
    2021-05-06 14:57:45.081  INFO 17208 --- [           main] c.e.s.SpringBootConceptsApplication      : Starting SpringBootConceptsApplication using Java 15 on LAPTOP-6201R5KJ with PID 17208 (D:\Umesh\code-playarea\springboot\spring-boot-concepts\target\classes started by rutvi in D:\Umesh\code-playarea\springboot\spring-boot-concepts)
    2021-05-06 14:57:45.084  INFO 17208 --- [           main] c.e.s.SpringBootConceptsApplication      : No active profile set, falling back to default profiles: default
    2021-05-06 14:57:45.936  INFO 17208 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port(s): 9090 (http)
    2021-05-06 14:57:45.946  INFO 17208 --- [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
    2021-05-06 14:57:45.947  INFO 17208 --- [           main] org.apache.catalina.core.StandardEngine  : Starting Servlet engine: [Apache Tomcat/9.0.45]
    2021-05-06 14:57:46.025  INFO 17208 --- [           main] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
    2021-05-06 14:57:46.025  INFO 17208 --- [           main] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 903 ms
    No args constructor in component
    2021-05-06 14:57:46.181  INFO 17208 --- [           main] o.s.s.concurrent.ThreadPoolTaskExecutor  : Initializing ExecutorService 'applicationTaskExecutor'
    2021-05-06 14:57:46.353  INFO 17208 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port(s): 9090 (http) with context path ''
    2021-05-06 14:57:46.362  INFO 17208 --- [           main] c.e.s.SpringBootConceptsApplication      : Started SpringBootConceptsApplication in 1.761 seconds (JVM running for 2.44)
    In the add method
    Addition of 1 and 2 = 3
    
    