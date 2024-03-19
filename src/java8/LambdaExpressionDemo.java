package java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
    Software Engineer class is not required as we can directly use Lambda expression as the
    implementation for the abstract method inside functional interface.
    Using lambda expression we don't need to use any separate implementation class.
*/
public class LambdaExpression {
    public static void main(String[] args) {
        Employee se = () -> {
            return "Software Engineer";
        };
        System.out.println(se.getName());

        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(5);
        list.add(1);
        list.add(3);
        list.add(2);

        Collections.sort(list);
        System.out.println(list);

        // Collections.sort(list, comparator)
        Collections.sort(list, (a, b) -> b - a);
        System.out.println(list);

        Student s1 = new Student(3, "Prashant");
        Student s2 = new Student(30, "Piya");
        Student s3 = new Student(7, "Pushpa");

        List<Student> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        Collections.sort(students, (a, b) -> b.id - a.id);
        System.out.println(students);
    }
}
