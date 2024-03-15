package generics;

/*
    Demo to show why Generics are needed

    In this demo, we have two printer classes: IntegerPrinter and StringPrinter.
    Each printer class is designed to print a specific type of value: integers and strings, respectively.

    We create instances of these printer classes with specific values (an integer value of 23 for IntegerPrinter, and a string value "MJ" for StringPrinter).
    Then, we call the print method on each instance to print the value it holds.

    The problem with this approach is that we need to create separate printer classes for each data type we want to print.
    This results in code duplication and reduces flexibility, especially when we need to work with different data types.
    If we want to print other data types like double, float, or custom objects, we would need to create additional printer classes for each of them.

    Generics address this issue by allowing us to create a single printer class that can work with any data type.
    By parameterizing the printer class with a generic type, we can create a more flexible and reusable solution.
    This way, we can write generic code that works with various data types without the need for code duplication.
*/
public class GenericsDemo {
    public static void main(String[] args) {
        IntegerPrinter ip = new IntegerPrinter(23);
        ip.print();

        StringPrinter sp = new StringPrinter("MJ");
        sp.print();

        Printer<Integer> p = new Printer<>(12);
        p.print();

        shout("Prashant", 25);
    }

    // Generic Method
    private static <T,V> void shout(T thingToShout, V otherThingToShout) {
        System.out.println(thingToShout + "!!!");
        System.out.println(otherThingToShout + "!!!");
    }
}
