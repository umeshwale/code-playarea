Functional Programming:
    
    These functions are not the same as the functions used 
    in imperative programming, such as a Java method that returns a value. 
    Instead, a functional programming function is like a 
    mathematical function, which produces an output that 
    typically depends only on its arguments
    
Object Oriented Approach:
    
     public static void printEmployee1(List<Employee> employees, int age)
       {
          for (Employee emp: employees)
             if (emp.getAge() < age)
                System.out.println(emp);
       }
     
     Above  method reveals the imperative, statement-oriented approach. 
     As specified, this method iterates over a list of employees, compares each employee's age against an argument value, 
     and (if the age is less than the argument), prints the employee's details.
 
 
 
 Functional Programming:
 
     public static void printEmployee2(List<Employee> employees, int age)
       {
          employees.stream()
                   .filter(emp -> emp.age < age)
                   .forEach(emp -> System.out.println(emp));
       }
       
     Above method reveals the declarative, expression-oriented approach, in this case implemented with the Streams API. 
     Instead of imperatively specifying how to print the employees (step-by-step), the expression specifies the desired outcome 
     and leaves the details of how to do it to Java. 
     Think of filter() as the functional equivalent of an if statement, 
     and forEach() as functionally equivalent to the for statement.
     
Five core techniques used in functional programming: 
    
    1. pure functions
    2. higher-order functions 
    3. lazy evaluation 
    4. closures
    5. currying           
    
Pure Functions:

    Pure functions returns the same result any number of times we call it with the same input.
    Pure functions dont have side effects
    Pure function dont change anything
    Pure function do not depend on anything that may possibly change.
    
    // impure bonus calculation
    var limit = 100;
    function calculatebonus(numSales) 
    {
       return(numSales > limit) ? 0.10 * numSales : 0
    }
    print(calculatebonus(174))
    
    // pure bonus calculation
    function calculatebonus2(numSales)
    {
       return (numSales > 100) ? 0.10 * numSales : 0
    }
    
    calculatebonus() is impure because it accesses the external limit variable. In contrast, calculatebonus2() is pure 
    because it obeys both requirements for purity.