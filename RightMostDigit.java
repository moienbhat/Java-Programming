import java.util.Scanner;

class RightMostDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if((a % 10 == b % 10) || (a % 10 == c % 10) || (b % 10 == c % 10))
            System.out.println(true);
        else
            System.out.println(false);
    }
}
