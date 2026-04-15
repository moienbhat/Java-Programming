
import java.util.Scanner;

class OddEven{
    public static void main(String[] args){
        try (Scanner sc =  new Scanner(System.in) ){

            System.out.print("Enter a number : ");
            int num = sc.nextInt();

            if(num%2 == 0) {
                System.out.println("Number is Even. 1 ");
            }
            else {
                System.out.println("Odd Number. 0");
            }
        }    
        
        
        }
}