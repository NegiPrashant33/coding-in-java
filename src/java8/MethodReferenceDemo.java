package java8;

import java.util.Arrays;
import java.util.List;

public class MethodReferenceDemo {

    public static void print(String str) {
        System.out.println(str);
    }
    public static void main(String[] args) {
        List<String> students = Arrays.asList("Prashant", "Piya", "Popat");
        students.forEach(x -> System.out.println(x));
        students.forEach(MethodReferenceDemo::print);
        // students.forEach(x -> print(x)); --> does the same work as the above method reference
    }
}
