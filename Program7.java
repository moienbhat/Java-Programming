import java.util.*;

class Program7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of matrix (n x n): ");
        int n = sc.nextInt();

        int a[][] = new int[n][n];

        System.out.println("Enter elements of the matrix:");
        for(int i = 0; i < n; i++)
            for(int j = 0; j < n; j++)
                a[i][j] = sc.nextInt();

        boolean symmetric = true;

        for(int i = 0; i < n; i++)
            for(int j = 0; j < n; j++)
                if(a[i][j] != a[j][i])
                    symmetric = false;

        if(symmetric)
            System.out.println("Matrix is Symmetric");
        else
            System.out.println("Matrix is Not Symmetric");
    }
}