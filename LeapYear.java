import java.util.Scanner;

class LeapYear{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the year : ");
        int x = sc.nextInt();

        if(x%4==0 ||(x%100==0 && x%400!=0)){
            System.out.println("It is a Leap Year.");
        }
        else{
            System.out.println("It is not a Leap Year.");
        }

    }
}