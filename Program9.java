import java.util.*;

class Program9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        int v = 0, c = 0, d = 0, sp = 0;

        for(char ch : s.toCharArray()){
            if("aeiouAEIOU".indexOf(ch) != -1)
                v++;
            else if(Character.isLetter(ch))
                c++;
            else if(Character.isDigit(ch))
                d++;
            else
                sp++;
        }

        System.out.println("Vowels = " + v);
        System.out.println("Consonants = " + c);
        System.out.println("Digits = " + d);
        System.out.println("Special Characters = " + sp);
    }
}