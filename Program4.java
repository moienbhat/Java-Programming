import java.util.*;
class Program4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n1 and n2: ");
        int n1=sc.nextInt(), n2=sc.nextInt();
        int a[]=new int[n1], b[]=new int[n2];
        System.out.print("Enter elements of n1 : ");
        for(int i=0;i<n1;i++) a[i]=sc.nextInt();
        
        System.out.print("Enter elements of n2 : ");
        for(int i=0;i<n2;i++) b[i]=sc.nextInt();

        int c[]=new int[n1+n2];
        for(int i=0;i<n1;i++) c[i]=a[i];
        for(int i=0;i<n2;i++) c[n1+i]=b[i];

        Arrays.sort(c);
        for(int x:c) System.out.print(x+" ");
    }
}