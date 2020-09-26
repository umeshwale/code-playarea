package funcprog.predefinedFunctions.Function;

/*
    interface Function<T, R> {
        public R apply (T t);
      }
 */

import funcprog.model.Student;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionExApply3 {
    public static void main(String[] args) {

        Function<Student, String> f = student -> {
            int marks = student.getMarks();
            String grade = "";
            if (marks>80) grade ="A [Distinction]";
            else if (marks>60) grade ="B [First Class]";
            else if (marks>35) grade ="C [Passed]";
            else grade = "Failed";
            return grade;
        };

        Predicate<Student> p = s -> s.getMarks()<35;
        List<Student> studentList = Arrays.asList(new Student("John", 82),
                new Student("Johnny", 62), new Student("Jonathan", 52),
                new Student("Jeevan", 30));
        // Give grades of Student as per marks like marks >80 then A, >60 then B, >50 then C
        for (Student s : studentList) {
            System.out.println("Student Name: "+s.getName());
            System.out.println("Student Marks: "+s.getMarks());
            System.out.println("Student Grade: "+f.apply(s));
            System.out.println();
        }
        // Display name of students who are failed
        for (Student s : studentList) {
            if (p.test(s)) {
                System.out.println("Student Name: "+s.getName());
                System.out.println("Student Marks: "+s.getMarks());
                System.out.println("Student Grade: "+f.apply(s));
                System.out.println();
            }

        }

    }
}
