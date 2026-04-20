import java.util.Scanner;

class CountDigitsDivNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        int temp = num;
        int count = 0;

        while (temp > 0) {
            int digit = temp % 10;

            if (digit != 0 && num % digit == 0)
                count++;

            temp /= 10;
        }

        System.out.println("Count = " + count);
    }
}