# Spring boot @Scheduled

To schedule job in spring boot application to run periodically, spring boot provides @EnableScheduling and @Scheduled annotations.

Let’s say you want to run job at every 10 seconds interval. You can achieve this job scheduling in below steps:

1. Add @EnableScheduling annotation to your spring boot application class. 

           
            @EnableScheduling is a Spring Context module annotation. 
            It internally imports the SchedulingConfiguration via the @Import(SchedulingConfiguration.class) instruction 
            
            @SpringBootApplication
            @EnableScheduling
            public class SpringBootWebApplication {
                 
            }
                
2. @Scheduled annotations to methods : 

        
        Now you can add @Scheduled annotations on methods which you want to schedule. 
        Only condition is that methods should be without arguments.
        
        For every annotated method without arguments, the appropriate executor thread pool will be created. 
        This thread pool will manage the scheduled invocation of the annotated method.

2.1 - Schedule task at fixed rate :

        Execute a task at a fixed interval of time:
        
        @Scheduled(initialDelay = 1000, fixedRate = 10000)
        public void run() {
            logger.info("Current time is :: " + Calendar.getInstance().getTime());
        }
        
2.2 - Schedule task at fixed delay :

        Configure a task to run after a fixed delay. 
        In given example, the duration between the end of last execution and the start of next execution is fixed. 
        The task always waits until the previous one is finished.
        
        @Scheduled(fixedDelay = 10000)
        public void run() {
            logger.info("Current time is :: " + Calendar.getInstance().getTime());
        }
        
2.3 - Spring boot cron job example :

        @Scheduled annotation is very flexible and may take cron expression as well.
    
        Date sequence generator for a Crontab pattern, allowing clients to specify a pattern that the sequence matches.
        The pattern is a list of six single space-separated fields: representing second, minute, hour, day, month, weekday. 
        Month and weekday names can be given as the first three letters of the English names.
        
        Example patterns:
        
        "0 0 * * * *" = the top of every hour of every day.
        "*/10 * * * * *" = every ten seconds.
        "0 0 8-10 * * *" = 8, 9 and 10 o'clock of every day.
        "0 0 6,19 * * *" = 6:00 AM and 7:00 PM every day.
        "0 0/30 8-10 * * *" = 8:00, 8:30, 9:00, 9:30, 10:00 and 10:30 every day.
        "0 0 9-17 * * MON-FRI" = on the hour nine-to-five weekdays
        "0 0 0 25 12 ?" = every Christmas Day at midnight
        
        @Scheduled(cron = "0 10 10 10 * ?")
        public void run() {
            logger.info("Current time is :: " + Calendar.getInstance().getTime());
        }