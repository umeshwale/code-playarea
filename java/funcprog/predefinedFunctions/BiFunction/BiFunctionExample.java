package funcprog.predefinedFunctions.BiFunction;

import funcprog.model.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class BiFunctionExample {

    public static void main(String[] args) {
        BiFunction<Integer, String, Student> bf = (marks, name) -> new Student(name, marks);

        List<Student> studentList = new ArrayList<Student>();
        studentList.add(bf.apply(40, "John"));
        studentList.add(bf.apply(60, "Johnny"));
        studentList.add(bf.apply(80, "Johnathan"));

        for (Student student : studentList) {
            System.out.println("Student Name: "+student.getName());
            System.out.println("Student Marks: "+student.getMarks());
            System.out.println();
        }
    }
}
