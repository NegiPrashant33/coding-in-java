package java8;

import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {
        Supplier<Integer> supplier = () -> 3;
        System.out.println(supplier.get());
    }
}
