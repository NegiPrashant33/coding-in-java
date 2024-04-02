package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {

        // test method
        Predicate<Integer> predicate = salary -> salary > 100000;
        System.out.println(predicate.test(100));

        if(predicate.test(1000000))
            System.out.println("salary greater than 1 lakh.");


        /*List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int sum = numbers.stream().filter(num -> num % 2 == 0).mapToInt(n -> n).sum();
        System.out.println(sum);*/

        Predicate<Integer> isEven = num -> num % 2 == 0;
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        for(Integer num : numbers) {
            if(isEven.test(num))
                System.out.println(num);
        }

        // and / or methods
        Predicate<String> startsWithLetterP = x -> x.toLowerCase().charAt(0) == 'p';
        Predicate<String> endsWithLetterT = x -> x.toLowerCase().charAt(x.length() - 1) == 't';

        System.out.println(startsWithLetterP.and(endsWithLetterT).test("Prashant"));
        System.out.println(startsWithLetterP.or(endsWithLetterT).test("Piyaaaa"));
        System.out.println(startsWithLetterP.negate().test("Popat"));

        // isEquals method
        Predicate<String> isEqualToJava = Predicate.isEqual("Java");

        System.out.println(isEqualToJava.test("Java"));
        System.out.println(isEqualToJava.test("Python"));

    }
}
