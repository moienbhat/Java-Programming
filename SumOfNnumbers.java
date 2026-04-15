import java.util.Scanner;

class SumOfNnumbers{
    public static void main(String[] args){
        try (Scanner sc =  new Scanner(System.in) ){

            System.out.print("Enter a number : ");
            int num = sc.nextInt();

            int sum = 0;

            for (int i=0; i<=num; i++){
                sum += i;
                
            }

            System.out.println(sum);
        }    
        
        
        }
}