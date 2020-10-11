# Circuit Breaker in SpringBoot using Hystrix

What is Circuit Breaker?

    A circuit breaker is an automatically operated electrical switch designed to protect an electrical circuit from damage 
    caused by excess current from an overload or short circuit. 
    Its basic function is to interrupt current flow after a fault is detected.

What is Circuit Breaker in Microservice? 
  
    You will build a microservice application that uses the circuit breaker pattern to gracefully degrade functionality 
    when a method call fails. 
    Use of the Circuit Breaker pattern can let a microservice continue operating when a related service fails, preventing 
    the failure from cascading and giving the failing service time to recover.
    
What is Hystrix?

    It is implementation for the circuit breaker pattern. 
    It is developed by Netflix Team
    
How to implement Hystrix in Microservice

    1. Add Hystrix Maven Dependency 
    
        <dependency>
            <groupId>org.springframework.cloud</groupId>
            <artifactId>spring-cloud-starter-netflix-hystrix</artifactId>
        </dependency>
        
    2. Enable Hystrix circuit breaker implementation using @EnableCircuitBreaker in main application class

        @SpringBootApplication
        @EnableCircuitBreaker
        public class SpringCloudHystrixApplication {
    
    3. Add @HystrixCommand where we want to add Hystrix as below
    
         @HystrixCommand(fallbackMethod = "getFallBackResponse")
            public String getLiveResult(@PathVariable(value = "hystrixFlag") boolean flag) throws Exception {
                if (flag) {
                    return "This response is from Live Method";
                } else throw new Exception();
            }
    
    4. Define fall back method mentioned above, make sure to keep same signature & return type
        
            public String getFallBackResponse(@PathVariable(value = "hystrixFlag") boolean flag) throws Exception {
                    return "This response is from Dummy FallBack Method";
            }    