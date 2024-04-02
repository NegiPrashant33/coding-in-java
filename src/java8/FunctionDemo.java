package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {

        // apply method
        Function<String, Integer> func1 = x -> x.length();
        Function<String, String> func2 = s -> s.substring(0, 3);
        System.out.println(func1.apply("prashant"));
        System.out.println(func2.apply("piya"));

        Function<List<Student>, List<Student>> studentsWithPraAsPrefix = li -> {
            List<Student> result = new ArrayList<>();
            for(Student s : li) {
                if(func2.apply(s.getName()).equalsIgnoreCase("pra"))
                    result.add(s);
            }
            return result;
        };

        Student s1 = new Student(1, "prashant");
        Student s2 = new Student(1, "prayaa");
        Student s3 = new Student(1, "popat");
        List<Student> students = Arrays.asList(s1, s2, s3);
        List<Student> filteredStudents = studentsWithPraAsPrefix.apply(students);
        System.out.println(filteredStudents);


        // Function chaining, andThen / compose methods
        Function<Integer, Integer> function1 = x -> x * 2;
        Function<Integer, Integer> function2 = x -> x * x * x;
        System.out.println(function1.andThen(function2).apply(3));
        System.out.println(function2.andThen(function1).apply(3));
        System.out.println(function1.compose(function2).apply(3));

        // identity method
        Function<String, String> identityFunction = Function.identity();
        System.out.println(identityFunction.apply("prashant"));
    }
}
