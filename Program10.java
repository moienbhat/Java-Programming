import java.util.*;

class Program10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of strings: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        if(n == 0){
            System.out.println("No strings entered.");
            return;
        }

        String arr[] = new String[n];

        System.out.println("Enter the strings:");
        for(int i = 0; i < n; i++) {
            System.out.print("String " + (i+1) + ": ");
            arr[i] = sc.nextLine();
        }


        Arrays.sort(arr, String.CASE_INSENSITIVE_ORDER);

        System.out.println("\nSorted Strings (Alphabetical Order):");
        for(String s : arr)
            System.out.println(s);


        String longest = arr[0];
        for(String s : arr)
            if(s.length() > longest.length())
                longest = s;

        System.out.println("\nLongest String = " + longest);
    }
}