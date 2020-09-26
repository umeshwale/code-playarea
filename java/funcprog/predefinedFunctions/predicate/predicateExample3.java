package funcprog.predefinedFunctions.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class Employee {
    String name;
    long salary;
    public Employee(String name, long salary) {
        this.name = name;
        this.salary = salary;
    }
}

public class predicateExample3 {
    public static void main(String[] args) {

        List<Employee> employeeList = Arrays.asList(new Employee("John", 1000),
                new Employee("Jonathan", 2000),
                new Employee("Robert", 3000),
                new Employee("Sherlock", 4000));

        System.out.println("Display Employee  name whose salary is greater than 2000: ");
        Predicate<Employee> p1 = e -> e.salary>2000;
        for (Employee e : employeeList) {
            if(p1.test(e)) {
                System.out.println(e.name);
            }
        }

    }
}
