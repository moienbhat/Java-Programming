import java.util.Scanner;

class NumberClassification {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();


        if (num > 0) System.out.println("Positive");
        else if (num < 0) System.out.println("Negative");
        else System.out.println("Zero");


        if (num % 2 == 0) System.out.println("Even");
        else System.out.println("Odd");


        if (num % 5 == 0) System.out.println("Multiple of 5");
        else System.out.println("Not a multiple of 5");


        if (num >= 100 && num <= 999) System.out.println("Three-digit number");
        else System.out.println("Not a three-digit number");
    }
}