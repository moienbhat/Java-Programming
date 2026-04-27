import java.util.*;
class Program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();

        int even=0, odd=0;
        System.out.println("Reverse:");
        for(int i=n-1;i>=0;i--){
            System.out.print(arr[i]+" ");
            if(arr[i]%2==0) even++;
            else odd++;
        }
        System.out.println("\nEven = "+even+" Odd = "+odd);
    }
}