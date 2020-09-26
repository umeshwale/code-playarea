Supplier:

    It represents a function which does not take in any argument but produces a value of type T.
    
    Hence this functional interface takes in only one generic namely:-
        T: denotes the type of the result
        
    The lambda expression assigned to an object of Supplier type is used to define its get() which eventually produces a value. Suppliers are useful when we don’t need to supply any value and obtain a result at the same time.
    
    The Supplier interface consists of only one function:
    
    1. get()
        This method does not take in any argument but produces a value of type T.
    