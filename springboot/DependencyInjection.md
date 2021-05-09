# Spring Dependency Injection

Real Life Based Introduction to Dependency Injection

    One Lehman analogy to understand Dependency injection is - Every human can run, walk, breath by himself and he dont have 
    dependency to do these activity. But when we say person can eat then person has dependency on food to eat & satisfying  
    this is dependecy injection. 
    
   
    
    Scenario 1:
        You work in an organization where you and your colleagues tend to travel a lot. 
        Generally you travel by air and every time you need to catch a flight, you arrange for a pickup by a cab. 
        You are aware of the airline agency who does the flight bookings, and the cab agency which arranges for the 
        cab to drop you off at the airport.
        You know the phone numbers of the agencies, you are aware of the typical conversational activities to conduct 
        the necessary bookings.
        Thus your typical travel planning routine might look like the following :
            -	Decide the destination, and desired arrival date and time
            -	Call up the airline agency and convey the necessary information to obtain a flight booking.
            -	Call up the cab agency, request for a cab to be able to catch a particular flight from say your residence 
                (the cab agency in turn might need to communicate with the airline agency to obtain the flight departure
                schedule, the airport, compute the distance between your residence and the airport and compute the 
                appropriate time at which to have the cab reach your residence)
            -	Pickup the tickets, catch the cab and be on your way
            
        Now if your company suddenly changed the preferred agencies and their contact mechanisms, you would be subject 
        to the following relearning scenarios
            -	The new agencies, and their new contact mechanisms (say the new agencies offer internet based services
                and the way to do the bookings is over the internet instead of over the phone)
            -	The typical conversational sequence through which the necessary bookings get done (Data instead of voice).
    
    Its not just you, but probably many of your colleagues would need to adjust themselves to the new scenario. 
    This could lead to a substantial amount of time getting spent in the readjustment process.
    
    Scenario 2:
        Now lets say the protocol is a little bit different. 
        You have an administration department. Whenever you needed to travel an administration department interactive 
        telephony system simply calls you up (which in turn is hooked up to the agencies). 
        Over the phone you simply state the destination, desired arrival date and time by responding to a programmed set of questions. 
        The flight reservations are made for you, the cab gets scheduled for the appropriate time, and the tickets get delivered to you.
        
        Now if the preferred agencies were changed, the administration department would become aware of a change, would perhaps 
        readjust its workflow to be able to communicate with the agencies. 
        The interactive telephony system could be reprogrammed to communicate with the agencies over the internet. 
        However you and your colleagues would have no relearning required. 
        You still continue to follow exactly the same protocol as earlier (since the administration department did all 
        the necessary adaptation in a manner that you do not need to do anything differently).
        
    Dependency Injection? In both the scenarios, you are the client and you are dependent upon the services provided by the agencies.
    However Scenario 2 has a few differences.
        -	You don’t need to know the contact numbers / contact points of the agencies – the administration 
            department calls you when necessary.
        -	You don’t need to know the exact conversational sequence by which they conduct their 
            activities (Voice / Data etc.) (though you are aware of a particular standardized conversational sequence 
            with the administration department)
        -	The services you are dependent upon are provided to you in a manner that you do not need to readjust 
            should the service providers change.
    
    Thats dependency injection in “real life”. 
    This may not seem like a lot since you imagine a cost to yourself as a single person – but if you imagine a large organization 
    the savings are likely to be substantial.
    
What is Dependency Injection?


    Dependency Injection means injecting the dependency between two object as per as our requirement in our application, 
    this help to reducing the dependency to each other and more beneficiary to unit testing of every objects independently.
    
    Every java based application has a few objects that work together to present what the end-user sees as a working application. 
    When writing a complex Java application, application classes should be as independent as possible of other Java classes to 
    increase the possibility to reuse these classes and to test them independently of other classes while doing unit testing

Advantages of Dependency Injection–

    1.	Reducing the dependency to each other of objects in application.
    2.	Every objects in application could individually unit testing with different mock implementation.
    3.	Loosely couple or it promotes decoupling to application
    4.	Promotes re-usability of code or objects in different applications
    5.	Promotes logical abstraction of components.

Two ways to perform Dependency Injection in Spring framework

    Spring framework provides two ways to inject dependency
    
        By Constructor
        By Setter method

        
    Example
    
        Consider an application has the Drawing class. 
        In Drawing class there is a Shape class.
        Shape may be Triangle or Circle or Rectangle etc.
        
        Dependency with Constructor Injection–
        
        If there is HAS-A relationship between the classes, we create the instance of dependent object (contained object) first
        then pass it as an argument of the main class constructor. 
        
        Here, our scenario is Drawing HAS-A Shape. 
        The Shape class object will be termed as the dependent object. 
        Let's see the Shape class first:
        
            public class Shape {  
            private String Triangle;  
            private String Circle;  
            private String Rectangle;  
              
            public Shape(String Triangle, String Circle, String Rectangle) {  
                super();  
                this.Triangle = Triangle;  
                this.Circle = Circle;  
                this.Rectangle = Rectangle;  
            }  
           }  
        
        And this Shape class dependency will be injected in class drawing 
        
            public class Drawing{
               private Shape shape;
               public Drawing(Shape shape) {
                  this.shape = shape;
               }
            }
    
        Here Drawing does not care about the what type shape should be to draw. 
        The Shape will be implemented independently and will be provided to Drawing at the time of Drawing instantiation 
        and this entire procedure is controlled by the Spring Framework.
        
        Here, we have removed the total control from Drawing and kept it somewhere else (ie. XML configuration file)
        and the dependency ( ie. class Shape) is being injected into the class Shape through a Class Constructor. 
        Thus flow of control has been “inverted” by Dependency Injection (DI) because you have effectively delegated 
        dependance’s to some external system.
        
        Dependency with Setter Injection–
        
            public class Drawing{
               private Shape shape;
               public void setShape(Shape shape) {
                  this.shape = shape;
               }
            }
        Second method of injecting dependency is through Setter Methods of Drawing class where we will create Shape instance
        and this instance will be used to call setter methods to initialize Drawing’s properties.

Dependency Injection Design Pattern:

    The dependency injection design pattern is a way of object configuration to obtain independency of each object responsibilities.
    In there, a dependent object is configured from the outside instead of configuring inside the same object. 
    It enables loose coupling of applications with a set of general guidelines and it is not a library, framework or tool. 
    This also popular as Hollywood principle – “Don’t call us – we’ll call you”.
    
    Instead of hard-coding dependencies, such as specifying a database server, list of services are injected into the component 
    via a third party. 
    So that component needs not to worry about creating and handling those external services. 
    It leads to many benefits especially when the system gets larger and complex. 
    Most of the time containers are used to manage and automate the construction and lifetimes of interdependent objects.
    
    
