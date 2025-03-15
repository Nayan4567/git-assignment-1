
public class ExceptionHandlingDemo {
    public static void main(String[] args) {
        try {
            int result = 10 / 0; // This will cause an exception
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: Division by zero is not allowed.");
        }
    }
}
