package java8;

import java.util.NoSuchElementException;
import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {
        Optional<String> name = getName(3);
        if(name.isPresent())
            System.out.println(name.get());

        name.ifPresent(System.out::println);

        String nameToBeUsed = name.orElse("NA");
        // String nameToBeUsed = name.orElseGet(() -> "NA");
        // String nameToBeUsed = name.orElseThrow(() -> new NoSuchElementException());
        System.out.println(nameToBeUsed);

        Optional<String> opt = getName(3);
        Optional<String> optional = opt.map(x -> x.toUpperCase());
        optional.ifPresent(System.out::println);
    }

    private static Optional<String> getName(int id) {
        String name = "prashant";
        //return Optional.of(name);
        return Optional.ofNullable(name);
    }
}
