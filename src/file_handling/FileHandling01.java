package file_handling;
import java.io.*;
public class FileHandling01 {
    public static void main(String[] args) {
        //inputStreamReader();
        //fileReader();
        //bufferedReader();
        //outputStreamWriter();
        fileWriter();
    }

    private static void inputStreamReader() {

        try(InputStreamReader isr = new InputStreamReader(System.in)) {
            System.out.print("Enter some letters: ");
            // returns the Unicode value of the character read, or -1 if the end of the stream has been reached
            // basically returns an integer
            int letters = isr.read();
            while(isr.ready()) {
                System.out.println((char) letters);
                letters = isr.read();
            }
            // isr.close(); --> try with resource will take care of closing the resource
            System.out.println();
        }
        catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }
    }

    private static void fileReader() {
        try(FileReader fr = new FileReader("<file path>")) {
            int letters = fr.read();
            while(fr.ready()) {
                System.out.print((char) letters);
                letters = fr.read();
            }
            System.out.println();
        }
        catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }
    }

    private static void bufferedReader() {
        // byte to char stream and then reading char stream
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("You typed: " + br.readLine());
        }
        catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }

        try (BufferedReader br = new BufferedReader(new FileReader("<file path>"))) {
            while(br.ready())
                System.out.println(br.readLine());
        }
        catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }
    }

    private static void outputStreamWriter() {
        try (OutputStreamWriter osw = new OutputStreamWriter(System.out)) {
            osw.write("Hello People");
            osw.write("\n");
            osw.write("A");
            osw.write("\n");
            osw.write("97");
            osw.write("\n");
            char[] arr = "hello again".toCharArray();
            osw.write(arr);
        }
        catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }
    }

    private static void fileWriter() {
        // will append and not overwrite
        try (FileWriter fw = new FileWriter("<file path>", true)) {
            fw.write("of Dehradun.");
        }
        catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }
    }
}
