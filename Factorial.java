import java.util.Scanner;

class Factorial {

    public static double Fact(int a){
        if(a>1){
            return a * Fact(a-1);
        }

        else{
            return 1;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number: ");
        int x = sc.nextInt();

        int fact = 1;  

        for(int i = 1; i <= x; i++) {
            fact = fact * i;   
        }

        double ans = Fact(x);
        System.err.println("Fact using function is : " + ans);

        System.out.println("Factorial is: " + fact);
    }
}