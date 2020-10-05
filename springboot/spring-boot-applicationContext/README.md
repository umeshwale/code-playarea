# Spring Boot ApplicationContext

Spring ApplicationContext

    ApplicationContext is a corner stone of a Spring Boot application. 
    It represents the Spring IoC container and is responsible for instantiating, configuring, and assembling the beans. 
    The container gets its instructions on what objects to instantiate, configure, and assemble by reading configuration metadata.
    The configuration metadata is represented in XML, Java annotations, or Java code.
    
ApplicationContext provides the following:

    - Bean factory methods for accessing application components
    - The ability to load file resources in a generic way
    - The ability to publish events to registered listeners
    - The ability to resolve messages, supporting internationalization

ApplicationContext has several implementations. 
For instance, the ClassPathXmlApplicationContext takes configuration from an XML file on the classpath 
or AnnotationConfigApplicationContext, which reads configuration using annotations, especially @Configuration.
    
In this example demo project we are accessing application context as below 
        
        in application.properties file we have included below property to access - 
        
            spring.application.name="My Application"
        
        To acces this property we can autowire ApplicationContext class file and access property
                        
            @SpringBootApplication
            public class SpringBootApplicationContextApplication {
            
                @Autowired
                private ApplicationContext applicationContext;
            
                public static void main(String[] args) {
                    SpringApplication.run(SpringBootApplicationContextApplication.class, args);
                }
            
                @Component
                public class ApplicationRunner implements CommandLineRunner {
            
                    @Override
                    public void run(String... args) throws Exception {
                        System.out.println(applicationContext.getDisplayName());
                        System.out.println(applicationContext.getId());
                    }
                }
                
Accessing Application Context in the other classes:
We could also access the “application-context” container into other classes. 
We can implement ApplicationContextAware as in the following example:
    
        public class MyBean implements ApplicationContextAware {
            private ApplicationContext applicationContext;
            @Override
           public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
                this.applicationContext = applicationContext;
            }
        }


The @SpringBootApplication annotation enables auto-configuration and component scanning. 
Spring Boot finds the MyBean annotation and loads it into the application context bean factory.


        