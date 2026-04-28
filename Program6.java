import java.util.*;

class Program6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int r = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int c = sc.nextInt();

        int a[][] = new int[r][c];
        int b[][] = new int[r][c];


        System.out.println("Enter elements of Matrix 1:");
        for(int i = 0; i < r; i++)
            for(int j = 0; j < c; j++)
                a[i][j] = sc.nextInt();


        System.out.println("Enter elements of Matrix 2:");
        for(int i = 0; i < r; i++)
            for(int j = 0; j < c; j++)
                b[i][j] = sc.nextInt();


        System.out.println("Addition:");
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++)
                System.out.print((a[i][j] + b[i][j]) + " ");
            System.out.println();
        }


        System.out.println("Subtraction:");
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++)
                System.out.print((a[i][j] - b[i][j]) + " ");
            System.out.println();
        }
    }
}