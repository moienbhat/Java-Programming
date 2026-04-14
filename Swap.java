import java.util.Scanner;

class Swap{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter number a to be swapped : ");
    int a = sc.nextInt();

    System.out.print("Enter number b to be swapped : ");
    int b = sc.nextInt();

    b = a+b;
    a = b-a;
    b = b-a;

    System.out.println("Numbers sfter swap are : " + a + b);

    }
}