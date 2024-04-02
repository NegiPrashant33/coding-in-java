package java8;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

// BiPredicate, BiFunction and BiConsumer
public class BiDemo {
    public static void main(String[] args) {

        BiPredicate<String, Integer> bp = (str, len) -> str.length() == len;
        System.out.println(bp.test("prashant", 8));

        BiFunction<String, String, Integer> bf = (x, y) -> x.length() + y.length();
        System.out.println(bf.apply("prashant", "piya"));

        BiConsumer<Integer, Integer> bc = (x, y) -> System.out.println(x + y);
        bc.accept(3, 30);
    }
}
