class DivisionByZeroException extends Exception {
    public DivisionByZeroException(String message) {
        super(message);
    }
}

public class Prog9 {
    public static void main(String[] args) {
        try {
            int numerator = 10;
            int denominator = 0;

            // Check if the denominator is zero and throw custom exception
            if (denominator == 0) {
                throw new DivisionByZeroException("Division by zero is not allowed");
            }

            // Perform division (this won't be reached if the exception is thrown)
            int result = numerator / denominator;
            System.out.println("Result: " + result);

        } catch (DivisionByZeroException e) {
            // Catch and handle the custom exception
            System.out.println("Custom Exception Caught: " + e.getMessage());
        } finally {
            // This block always executes
            System.out.println("Finally block executed");
        }
    }
}

