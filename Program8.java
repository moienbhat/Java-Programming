import java.util.*;

class Program8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of classes: ");
        int classes = sc.nextInt();

        System.out.print("Enter number of students per class: ");
        int students = sc.nextInt();

        System.out.print("Enter number of subjects: ");
        int subjects = sc.nextInt();

        int arr[][][] = new int[classes][students][subjects];

        System.out.println("Enter marks (class-wise, student-wise, subject-wise):");

        for(int i = 0; i < classes; i++)
            for(int j = 0; j < students; j++)
                for(int k = 0; k < subjects; k++) {
                    System.out.print("Class " + i + " Student " + j + " Subject " + k + ": ");
                    arr[i][j][k] = sc.nextInt();
                }

        System.out.println("\nTotal marks of each student:");

        for(int i = 0; i < classes; i++){
            for(int j = 0; j < students; j++){
                int total = 0;
                for(int k = 0; k < subjects; k++)
                    total += arr[i][j][k];

                System.out.println("Class " + i + " Student " + j + " Total = " + total);
            }
        }
    }
}