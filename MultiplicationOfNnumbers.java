import java.util.Scanner;

class MultiplicationOfNnumbers{
    public static void main(String[] args){
        try (Scanner sc =  new Scanner(System.in) ){

            System.out.print("Enter a number : ");
            int num = sc.nextInt();

            int prod = 1;

            for (int i=1; i<=num; i++){
                prod *= i;
                
            }

            System.out.println(prod);
        }    
        
        
        }
}