package funcprog.predefinedFunctions.BiConsumer;

import funcprog.model.Student;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample {
    public static void main(String[] args) {

        List<Student> studentList = Arrays.asList(new Student("John", 40 ),
                new Student("Johnny", 50 ),
                new Student("John", 60 ) );
        studentList.stream().forEach(System.out::println);

        // Requirement is to increase 10 marks of each student
        BiConsumer<Student, Integer> bc = (student, marks) -> student.setMarks(student.getMarks() + marks);
        studentList.stream().forEach( student -> bc.accept(student, 10));
        studentList.stream().forEach(System.out::println);
    }
}
