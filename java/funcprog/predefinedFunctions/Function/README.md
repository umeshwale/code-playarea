Function:   

    The Function Interface is a part of the java.util.function package which has been introduced since Java 8, 
    to implement functional programming in Java.
    It represents a function which takes in one argument and produces a result.
    
    Hence this functional interface which takes in 2 generics namely:-
    
    T: denotes the type of the input argument
    R: denotes the return type of the function
    
    The lambda expression assigned to an object of Function type is used to define its apply() which eventually 
    applies the given function on the argument.
    
    Methods in Function Interface
    The Function interface consists of the following 4 methods:
    
    1. apply()
        This method applies the given function on its only argument.
        Syntax:
                R apply(T t)
                   Parameters: This method takes in only one parameter t which is the function argument
                   Returns: This method returns the function result which is of type R.
    
    2. andThen()
        It returns a composed function wherein the parameterized function will be executed after the first one.
        If evaluation of either function throws an error, 
        it is relayed to the caller of the composed function.
        
    3. compose()
        It returns a composed function wherein the parameterized function will be executed first and then the first one. 
        If evaluation of either function throws an error, 
        it is relayed to the caller of the composed function.
        
    What is difference between adnThen() & Compose 
        andThen() -
            f1.andThen(f2).apply(i);
                Here first f1 will be applied and then f2 will be applied 
            Example:
             Function<Integer, Integer> f1 = i -> i*2;
             Function<Integer, Integer> f2 = i -> i*i*i;
             System.out.println("compose Example: "+f1.andThen(f2).apply(2));  = output =64
        compose() - 
            f1.compose(f2).apply(i);
                Here first f2 will be applied and then f1 will be applied
            Example:
                 Function<Integer, Integer> f1 = i -> i*2;
                 Function<Integer, Integer> f2 = i -> i*i*i;
                 System.out.println("compose Example: "+f1.compose(f2).apply(2));  = output =16
        