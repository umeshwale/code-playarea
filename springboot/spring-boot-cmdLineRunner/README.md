# Spring Boot CommandLineRunner Interface 

What is CommandLineRunner

    Spring boot’s CommandLineRunner interface is used to run a code block only 
    once in application’s lifetime – after application is initialized
    
How to use CommandLineRunner
    
    Create component class as below - 
    
    @Component
    public class ApplicationStartupRunner implements CommandLineRunner {
        protected final Log logger = LogFactory.getLog(getClass());
     
        @Override
        public void run(String... args) throws Exception {
            logger.info("ApplicationStartupRunner run method Started !!");
        }
    }  
    
Why use CommandLineRunner interface

    Command line runners are a useful functionality to execute the various types of code that only have to be run once,
    right after application startup.
    FYI, Spring Batch relies on these runners in order to trigger the execution of the jobs.
    We can use the dependency injection to our advantage in order to wire in whatever dependencies that we need and 
    in whatever way we want – in run() method implementation.
    

  