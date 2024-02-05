package exception_handling;

/*

   - With try block we need to have atleast one catch block
   - Within the try block, the statements after the point where the exception occurs are not executed
   - We can have multiple catch blocks
   - Finally block is executed whether exception occurs or not
   - If there is no catch block, and we have a finally-block with try then the finally blocks gets executed and then exception error is given in console
   - If a generalized catch block is written before the specific catch block then it will give an error

*/
public class ExceptionHandling {
    public static void main(String[] args) {
        try {
            int number = Integer.parseInt("pants");
        }
        catch (NumberFormatException nfe) {
            System.out.println(nfe);
            //System.out.println(ex.toString());
            //System.out.println(ex.getMessage());
            //System.out.println(Arrays.toString(ex.getStackTrace()));
        }
        finally {
            System.out.println("Finally block executed");
        }
        System.out.println("End here");

    }

}
