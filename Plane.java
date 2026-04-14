import java.util.Scanner;

class Plane{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the x coordinate : ");
        int x = sc.nextInt();

        System.out.print("Enter the y coordinate : ");
        int y = sc.nextInt();

        if(x==0 && y ==0){
            System.err.println("The point is on Origin.");
        }
        else if(x>=1 && y == 0 ){
            System.err.println("The point is on X axis.");
        }
        else if(x==0 && y >=1 ){
            System.err.println("The point is on Y axis.");
        }
        else if(x>0 && y>0 ){
            System.err.println("The point is in First Quadrant.");
        }
        else if(x<0 && y>0 ){
            System.err.println("The point is on Second Quadrant.");
        }
        else if(x<0 && y<0 ){
            System.err.println("The point is on Third Quadrant.");
        }
        else if(x>0 && y<0 ){
            System.err.println("The point is on Fourth Quadrant.");
        }


    }
}