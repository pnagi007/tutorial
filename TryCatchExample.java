import java.util.*;
public class TryCatchExample {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};

        try {
            // Code that might throw an exception
            int result = numbers[3]; // This line will throw ArrayIndexOutOfBoundsException

            System.out.println("Result: " + result); 
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handle the exception
            System.err.println("Error: Array index out of bounds.");
            e.printStackTrace(); // Print the exception stack trace for debugging
        } finally {
            // Code that always executes, regardless of whether an exception occurred
            System.out.println("Finally block executed.");
        }
    }
}