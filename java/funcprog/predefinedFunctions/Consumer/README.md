Consumer:
    
        The Consumer Interface is a part of the java.util.function package which has been introduced since Java 8, 
        to implement functional programming in Java. 
        It represents a function which takes in one argument and produces a result. 
        However these kind of functions don’t return any value.
        
        Hence this functional interface which takes in one generic namely:-
        
        T: denotes the type of the input argument to the operation
        The lambda expression assigned to an object of Consumer type is used to define its accept() which eventually 
        applies the given operation on its argument. 
        Consumers are useful when it not needed to return any value as they are expected to operate via side-effects.
        
        interface consumer<T>
        {
            public void accept(T t);
        }