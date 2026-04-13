import java.util.Scanner;

class AreaCircleRect{
    public static void main(String[] args){

        try (Scanner sc = new Scanner(System.in)) {

        System.out.print("Enter radius of circle : ");
        int x = sc.nextInt();

        System.out.print("Enter length and breadth of rectangle : ");
        int y = sc.nextInt();
        int z = sc.nextInt();

        double cir_area = 3.141 * x * x;
        double cir_peri = 2 * 3.141 * x;

        double rect_area = y * z;
        double rect_peri = 2*(y+z);

        System.out.println("Circle Area is : " + cir_area);
        System.out.println("Circle perimeter is : " + cir_peri);
        System.out.println("Rectabgle area is : " + rect_area );
        System.out.println("Reactangle perimeter is : " + rect_peri);



        sc.close();
        }

        
    }
    }