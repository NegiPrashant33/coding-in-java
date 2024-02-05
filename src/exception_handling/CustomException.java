package exception_handling;

public class CustomException {
    public static void main(String[] args) throws AgeLessThanZeroException {
        validateAge(-3);
    }

    private static void validateAge(int age) throws AgeLessThanZeroException {
        if(age < 0) {
            throw new AgeLessThanZeroException("Age cannot be negative!");
            //throw new AgeLessThanZeroException();
            //throw new AgeLessThanZeroException(new RuntimeException());
            //throw new AgeLessThanZeroException("Oh no", new RuntimeException());
        }
    }
}
