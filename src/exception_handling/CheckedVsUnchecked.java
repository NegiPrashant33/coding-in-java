package exception_handling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedVsUnchecked {
    public static void main(String[] args) {


        // For unchecked exception
        String myName = null;
        printLength(myName);


        // For checked Exception you can either use try catch block or throws keyword again
        try {
            readFile("myFile.txt");
        }
        catch (FileNotFoundException fnfe) {
            System.out.println(fnfe);
        }
    }


    /*
       Checked Exceptions, there are two ways of handling checked exception
        1. Using try-catch block
        2. Using throws keyword
    */

    private static void readFile(String fileName) throws FileNotFoundException {

        FileReader reader = new FileReader(fileName);


        /*
            try {
                FileReader reader = new FileReader(fileName);
            }
            catch (FileNotFoundException fnfe) {
                System.out.println(fnfe);
            }
        */
    }


    /*
        Unchecked Exception we can handle this exception just like our Checked Exception
    */
    private static void printLength(String myString) {
        try {
            System.out.println(myString.length());
        }
        catch (NullPointerException npe) {
            System.out.println(npe);
        }
    }

}
