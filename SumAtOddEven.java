import java.util.Scanner;

class SumAtOddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 5-digit number: ");
        int num = sc.nextInt();

        int oddSum = 0, evenSum = 0, pos = 1;

        while (num > 0) {
            int digit = num % 10;

            if (pos % 2 == 0)
                evenSum += digit;
            else
                oddSum += digit;

            num /= 10;
            pos++;
        }

        System.out.println("Odd position sum = " + oddSum);
        System.out.println("Even position sum = " + evenSum);
        System.out.println("Difference = " + Math.abs(oddSum - evenSum));
    }
}