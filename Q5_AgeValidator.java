import java.util.Scanner;

/**
 * Q5: Accepts a user's age and checks whether they are at least 18.
 * Throws a custom InvalidAgeException if the age is below 18.
 */
public class Q5_AgeValidator {

    static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Invalid age: " + age + ". You must be at least 18 years old.");
        }
        System.out.println("Age verified. You are eligible (age: " + age + ").");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();

            checkAge(age);

        } catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: Please enter a valid numeric age.");
        } finally {
            scanner.close();
        }
    }
}
