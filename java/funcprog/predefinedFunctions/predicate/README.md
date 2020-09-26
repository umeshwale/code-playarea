Predicate:   

    A Functional Interface is an Interface which allows only one Abstract method within the Interface scope. 
    There are some predefined functional interface in Java like Predicate, consumer, supplier etc. 
    The return type of a Lambda function (introduced in JDK 1.8) is a also functional interface.
    
    The Functional Interface PREDICATE is defined in the java.util.Function package. 
    It improves manageability of code, helps in unit-testing them separately, and contain some methods.    

    - This is a functional interface and can therefore be used as the assignment target for a 
            lambda expression or method reference.
    - Represents a predicate (boolean-valued function) of one argument.
    - Below are predicate methods 
        1. and(Predicate<? super T> other)
                Returns a composed predicate that represents a short-circuiting logical AND of this predicate and another.
        2. isEqual(Object targetRef)
                Returns a predicate that tests if two arguments are equal according to Objects.equals(Object, Object).
        3. negate()
                Returns a predicate that represents the logical negation of this predicate.
        4. 	or(Predicate<? super T> other)
                Returns a composed predicate that represents a short-circuiting logical OR of this predicate and another.        
        5. 	test(T t)
                Evaluates this predicate on the given argument.