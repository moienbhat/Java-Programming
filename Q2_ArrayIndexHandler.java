import java.util.Scanner;

/**
 * Q2: Creates an array of five integers and allows the user to access
 * an element by index. Catches ArrayIndexOutOfBoundsException if the
 * index entered is invalid.
 */
public class Q2_ArrayIndexHandler {

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter an index (0-4) to access the array element: ");
            int index = scanner.nextInt();

            int value = numbers[index];
            System.out.println("Element at index " + index + " is: " + value);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid index! Please enter a value between 0 and 4.");
        } catch (Exception e) {
            System.out.println("Error: Please enter a valid integer index.");
        } finally {
            scanner.close();
        }
    }
}
