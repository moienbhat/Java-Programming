import java.util.Scanner;

/**
 * Q3: Validates that a password is at least 8 characters long.
 * Demonstrates try, throw, catch, and finally blocks.
 */
public class Q3_PasswordValidator {

    // Custom method that throws an exception for short passwords
    static void validatePassword(String password) throws Exception {
        if (password.length() < 8) {
            throw new Exception("Password must be at least 8 characters long.");
        }
        System.out.println("Password accepted. Length is valid.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a password: ");
            String password = scanner.nextLine();

            validatePassword(password);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
            System.out.println("Password validation process completed.");
        }
    }
}
