package java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
        Consumer<String> printConsumer = s -> System.out.println(s);
        Consumer<List<Integer>> listConsumer = li -> {
            for(Integer num : li)
                System.out.println(num + 100);
        };

        listConsumer.accept(Arrays.asList(1, 2, 3, 4, 5));

        // Consumer also have a andThen method which is similar to the method
        // used in the Function interface
    }
}
