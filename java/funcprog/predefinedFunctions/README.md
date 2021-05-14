This space is created to demonstrate Pre Defined Functions    

- Predicate<T t> - boolean return 
    
        Take some input and perform some conditional check and return BOOLEAN value
            1. test (T t)
            2. or(Predicate other) 
            3. and(Predicate other) 
            4. negate()
            5. isEqual(Object targetRef)

- Function<T, R> - R return 
    
        Take some input and perform some operation and then return the result which can be of any type. 
            1. apply(T t)
            2. andThen(Function<? super R,? extends V> after)
            3. compose(Function<? super V,? extends T> before)
            4. identity() - Returns a function that always returns its input argument.
           
- Consumer<T> - void return 
    
        Accept some input and perform some required operation and not required to return anything (void)
            1. accept(T t)
            2. andThen(Consumer<? super T> after)

- Supplier<R> 
       
         - accepts void and returns R

-BiPredicate<T t, T t> - boolean return 

            Take some input and perform some conditional check and return BOOLEAN value
            Normal predicate can take only one input parameter and perform some action and return boolean. 
            Sometimes we have requirement to perform some action on two input parameters for this kind of 
            requirement Bipredicate can be used.
            
            BiPredicate is exactly same as Predicate except that it will take 2 input arguments
            
            interface BiPredicate <T1, T2>
            {
                public boolean test (T1 t1, T2 t2);
                //remaining default and static methods are same
            }
            
   
BiFunction 

            It represents a function which takes in two arguments and produces a result.
            
            Hence this functional interface which takes in 3 parameters namely:-
            
            T: denotes the type of the first argument to the function
            U: denotes the type of the second argument to the function
            R: denotes the return type of the function
            
            The lambda expression assigned to an object of BiFunction type is used to define its apply() which 
            eventually applies the given function on the arguments. 
            
            The main advantage of using a BiFunction is that it allows us to use 2 input arguments while in function
            we can only have 1 input argument.    
            
            
BiConsumer:

            The BiConsumer Interface is a part of the java.util.function package which has been introduced since Java 8,
             to implement functional programming in Java. 
             It represents a function which takes in two arguments and produces a result. 
             However these kind of functions don’t return any value.
            
            This functional interface takes in two generics, namely:-
            
            T: denotes the type of the first input argument to the operation
            U: denotes the type of the second input argument to the operation
            The lambda expression assigned to an object of BiConsumer type is used to define its accept() 
            which eventually applies the given operation on its arguments.
            
            BiConsumers are useful when it is not required to return any value as they are expected to operate via side-effects.            

