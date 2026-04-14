
import java.util.Scanner;

class Addition{
    public static void main(String[] args){

        try (Scanner sc = new Scanner(System.in)) {

        System.out.print("Enter first number and second number: ");
        int x = sc.nextInt();
        int y = sc.nextInt();

        int sum = x + y;
        int mul = x * y;
        int sub = x - y;
        int div = x / y;
        int rem = x % y;

        System.out.println("Sum : " + sum);
        System.out.println("Mul : " + mul);
        System.out.println("Subration : " + sub );
        System.out.println("div : " + div);
        System.out.println("remainder : " + rem);


        sc.close();
        }

        
    }
    }
