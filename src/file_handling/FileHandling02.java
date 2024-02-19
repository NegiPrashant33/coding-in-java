package file_handling;
import java.io.*;
public class FileHandling02 {
    public static void main(String[] args) {

        // Creating a file, give the path and then /<file name> that you want to create in the file path option
        try {
            File file = new File("<file path>");
            file.createNewFile();
        }
        catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }

        // Writing a file
        try (FileWriter fw = new FileWriter("<file path>")) {
            fw.write("Everything is going to be alright");
        }
        catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }

        // Reading from a file
        try (BufferedReader bfr = new BufferedReader(new FileReader("<file path>"))) {
            while(bfr.ready())
                System.out.println(bfr.readLine());
        }
        catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }

        // Delete a file
        try {
            File file = new File("<file path>");
            file.createNewFile();
            if(file.delete())
                System.out.println(file.getName());
        }
        catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }
    }
}
