import java.util.*;
class Program1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int sum = 0;
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        int max = arr[0], min = arr[0];
        for(int i=1;i<n;i++){
            if(arr[i] > max) max = arr[i];
            if(arr[i] < min) min = arr[i];
        }
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + (sum/(double)n));
        System.out.println("Max = " + max);
        System.out.println("Min = " + min);
    }
}