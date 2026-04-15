
import java.util.Scanner;

class LargestOf2Numbers{
    public static void main(String[] args){
        try (Scanner sc =  new Scanner(System.in) ){

            System.out.print("Enter a number : ");
            int num1 = sc.nextInt();

            System.out.print("Enter a number : ");
            int num2 = sc.nextInt();

            if(num1>num2) {
                System.out.println("First Number is greater");
            }
            else {
                System.out.println("Second Number is greater");
            }
        }    
        
        
        }
}