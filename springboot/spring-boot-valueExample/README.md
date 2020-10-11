# @Value Annotation

@Value is a Java annotation that is used at the field or method/constructor parameter level and it indicates a default value
for the affected argument. 
It is commonly used for injecting values into configuration variables

There are different ways to use @Value annotation as below 

Basic Assignment
    
    @Value("This default Message")
    String defaultMessage;
    
    Here String defaultMessage will be assigned with String value as "This default Message"
    
Environment Values
    
    Injecting values from properties files with the help of @Value annotation is probably the most used use-case in real-life applications.
    
    We will use the default property file for Spring Boot - application.properties, 
    In application.properties we will add below value 
        my.greeting=Hi There!
        
    This can be retrieved using @Value annotation as below 
        
        @Value("${my.greeting}")
        String message;

Default Value
    
    If defined value is not present in configuration files then we will be able to pass default value as below - 
    
        @Value("${no.value:No value hence default value}")
        String defValue;
        
Spring Expression Language (SpEL)
    
    The Spring Expression Language (SpEL) is an expression language which serves as the foundation for expression evaluation 
    within the Spring portfolio.
    
    Basically, when using SpEL together with the @Value annotation, we are just changing the way we tell Spring what we need. 
    
    Below is value we defined in properties file and we need map of it 
        dbvalues={url:'dburl.com', userName:'name', password:'pass'}
        
    Then use @Value annotation as below 
     
        @Value("#{${dbvalues}}")
        Map<String, String> dbValues;
        
Injecting into Lists
    
    If a property has comma-separated-values, such as a simple list of books, 
    we can use SpEL to interpret it and transform it into a list:
    
    Below is value we defined in properties file and we need List of String of it 

        my.list.values=One, Two, Three

    Then use @Value annotation as below 
       
       @Value("#{'${my.list.values}'.split(',')}")
       List<String> listValues;
