import java.util.Scanner;

/**
 * Q4: Converts a user-entered numeric string into an integer using
 * Integer.parseInt(). Catches NumberFormatException for invalid input.
 */
public class Q4_NumberFormatHandler {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a numeric string to convert to an integer: ");
            String input = scanner.nextLine();

            int number = Integer.parseInt(input);
            System.out.println("Conversion successful. Integer value: " + number);

        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid input! Please enter a valid whole number (digits only).");
        } finally {
            scanner.close();
        }
    }
}
