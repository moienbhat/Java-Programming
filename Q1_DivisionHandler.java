import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Q1: Accepts two integers and performs division.
 * Handles ArithmeticException (divide by zero) and
 * InputMismatchException (non-numeric input) gracefully.
 */
public class Q1_DivisionHandler {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the numerator: ");
            int numerator = scanner.nextInt();

            System.out.print("Enter the denominator: ");
            int denominator = scanner.nextInt();

            int result = numerator / denominator;
            System.out.println("Result of division: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed. (" + e.getMessage() + ")");
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter valid integer values only.");
        } finally {
            scanner.close();
            System.out.println("Program terminated gracefully.");
        }
    }
}
