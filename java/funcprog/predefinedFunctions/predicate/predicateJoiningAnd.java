package funcprog.predefinedFunctions.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class predicateJoiningAnd {
    public static void main(String[] args) {

        List<Employee> employeeList = Arrays.asList(new Employee("John", 1000),
                new Employee("Jonathan", 2000),
                new Employee("Robert", 3000),
                new Employee("Sherlock", 4000));

        System.out.println("Display Employee  name length >5 AND salary is greater than 2000: ");
        Predicate<Employee> p1 = e -> e.salary>2000;
        Predicate<Employee> p2 = e -> e.name.length()>5;
        for (Employee e : employeeList) {
            if(p1.and(p2).test(e)) {
                System.out.println(e.name + " : " +e.salary);
            }
        }

    }
}
