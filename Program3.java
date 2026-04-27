import java.util.*;
class Program3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        System.out.print("Enter number to be found: ");
        int key = sc.nextInt();
        boolean found=false;
        for(int i=0;i<n;i++){
            if(arr[i]==key){
                System.out.println("Found at position "+i);
                found=true;
            }
        }
        if(!found) System.out.println("Not Found");
    }
}