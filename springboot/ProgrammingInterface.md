# Programming for interfaces than implementation

“Programming for interfaces than implementation” is very popular principle in java programming and design pattern. 
Let us see some interesting facts about interface in java in term of Spring Framework.

Actually interface in java is the core part of programming, 
it is not for hello world type of application, it is using for abstraction and decoupling concept in java. 
It is simple object oriented term to define contract or rules and abstraction between producer and consumer for applications.

Advantages or key facts of making use of them in Java 

    -	In very basic it allows us for multiple inheritance in java.
    -	In Spring Dependency Injection interface is very powerful to run time injection of various concrete implementations 
        of an interface in the application. By using references to interfaces instead of their concrete implementation classes help 
        to minimize ripple effects, as the user of interface reference doesn’t have to worry about the changes in the underlying 
        concrete implementation.
    -	Interfaces are a way to declare a contract for implementing classes to fulfill, it’s the primary tool to create abstraction
        and decoupled designs between consumers and producers.
    
    Example:
    
    	In an example we have a service to implement to save employee data to RDBMS and NoSQL database. 
    	If we were not using interface, the EmployeeRegistrationService may be implemented with two functions 
    	    1. saveToRDBMS() 
    	    2. saveToNoSQL().
        
            public class EmployeeRegistrationService {
                public void saveToRDBMS(Employee employee ) {
                    //save to RDBMS
                }
            
            public void saveToNoSQL(Employee employee ) {
                    //save to NoSQL DB
                }
            }
        
        In this case, the EmplyeeRegistrationController should be aware of the concrete implementation of these two functions 
        in EmployeeRegistrationService to use them. 
        Suppose we want to add additional functionality to save the information as JSON is required then you will have to 
        add a new function saveToJson() in the Service class as well as make changes in the Controller. 
        This adds lots of complication to maintenance of our huge application with hundreds of controllers and services. 
        
        To avoid these complications we could use interface instead of implementation of registration service
        
            interface EmployeeRegistrationService {
                void save(Employee employee );
              }
              
        Now controller doesn’t care about the concrete implementation of service, 
        it is only aware of this interface, which has a save method.
        
            public class EmployeeServiceRDS implements EmployeeRegistrationService {
               @Override 
               public void saveToRDBMS(Employee employee ) {
                    //save to RDBMS
                }
            }
            
            public class EmployeeServiceNoSQL implements EmployeeRegistrationService {
                @Override
                public void saveToNoSQL(Employee employee ) {
                    //save to NoSQL DB
                }
            }

            @Controller
            Class EmployeeController {
               
               @Resource(name="employeeServiceRDS ") 
               EmployeeRegistrationService  registrationService ;
            
                @RequestMapping("/emp-save")
                public void saveEmployee(Employee employee) {
                    registrationService.save(employee);
                }
              }
              
        This highly reduces the software modification and extension cost. 
        As changes in one layer does not effect other layer and new functionalities are made available to other layer immediately. 
        Thus using interface gives you more power over extending and maintaining your application, utilize abstraction and implement 
        good software development practices.
