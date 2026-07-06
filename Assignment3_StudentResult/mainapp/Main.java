package mainapp;

import result.Result;
import result.UGStudent;
import result.PGStudent;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Roll Number: ");
        String roll = sc.nextLine();
        System.out.print("Student Type (1-UG / 2-PG): ");
        int type = sc.nextInt();

        int[] marks = new int[5];
        System.out.println("Enter marks for 5 subjects:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Subject " + (i+1) + ": ");
            marks[i] = sc.nextInt();
        }

        if (type == 1) {
            UGStudent ug = new UGStudent(name, roll, marks);
            ug.displayResult();
        } else {
            PGStudent pg = new PGStudent(name, roll, marks);
            pg.displayResult();
        }
        sc.close();
    }
}
