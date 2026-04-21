import java.util.Scanner;

class SpecialTwoDigitNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two-digit number: ");
        int num = sc.nextInt();

        int a = num / 10;
        int b = num % 10;

        int result = (a + b) + (a * b);

        if (result == num)
            System.out.println("Special number");
        else
            System.out.println("Not a special number");
    }
}