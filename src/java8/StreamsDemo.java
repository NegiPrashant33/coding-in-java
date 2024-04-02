package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsDemo {
    public static void main(String[] args) {
        // Creating Streams
        List<String> list = Arrays.asList("Prashant", "Priya", "Prajakta");
        Stream<String> listStream = list.stream();

        String[] array = {"Prashant", "Priya", "Prajakta"};
        Stream<String> arrayStream = Arrays.stream(array);

        Stream<Integer> integerStream = Stream.of(1, 2, 3);
        Stream<Integer> limit1 = Stream.iterate(0, n -> n + 1).limit(100);
        Stream<Integer> limit2 = Stream.generate(() -> (int) Math.random() * 100).limit(100);

        // Filter, Map, Distinct, Sorted, Limit, Skip, Peek  in Stream
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> filteredNumbers = numbers.stream()
                .filter(x -> x % 2 == 0)
                .distinct()
                .sorted((a, b) -> b - a)
                .limit(5)
                .skip(1)
                .collect(Collectors.toList());
        System.out.println(filteredNumbers);
        List<Integer> mappedNumbers = filteredNumbers.stream().map(x -> x / 2).collect(Collectors.toList());
        System.out.println(mappedNumbers);

        List<Integer> lst = Stream.iterate(0, x -> x + 1)
                .peek(System.out::println)
                .limit(5)
                .toList();

        // Max and Min in Streams
        Integer maximum = Stream.iterate(0, n -> n + 1)
                .limit(101)
                .skip(1)
                .filter(x -> x % 2 == 0)
                .map(x -> x / 2)
                .distinct()
                .max((a, b) -> a - b)
                //.max((a, b) -> b - a) --> to find the minimum element
                .get();
        System.out.println(maximum);

        // Count
        Long integer = Stream.iterate(1, n -> n + 1)
                .limit(101)
                .map(n -> n / 20)
                .distinct()
                .peek(System.out::println)
                .count();
        System.out.println(integer);


        // Parallel Streams
        List<Integer> lsst = Arrays.asList(1, 2, 3, 4, 5);
        lsst.parallelStream();
    }
}
