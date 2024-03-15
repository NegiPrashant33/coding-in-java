package generics;

/*
    Demo to show why Generics are needed
*/
public class GenericsDemo01 {
    public static void main(String[] args) {
        IntegerPrinter ip = new IntegerPrinter(23);
        ip.print();

        StringPrinter sp = new StringPrinter("MJ");
        sp.print();
    }
}
