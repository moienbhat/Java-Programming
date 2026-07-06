package mainapp;

import electricity.BillCalculator;
import electricity.CommercialConsumer;
import electricity.DomesticConsumer;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Consumer Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Consumer ID: ");
        String id = sc.nextLine();
        System.out.print("Enter Consumer Type (1-Domestic / 2-Commercial): ");
        int type = sc.nextInt();
        System.out.print("Enter Units Consumed: ");
        int units = sc.nextInt();

        if (type == 1) {
            DomesticConsumer dc = new DomesticConsumer(name, id);
            dc.displayBill(units);
            // Runtime polymorphism
            BillCalculator bc = dc;
            System.out.println("[Polymorphism] Bill via interface: Rs. " + bc.calculateBill(units));
        } else {
            CommercialConsumer cc = new CommercialConsumer(name, id);
            cc.displayBill(units);
            BillCalculator bc = cc;
            System.out.println("[Polymorphism] Bill via interface: Rs. " + bc.calculateBill(units));
        }
        sc.close();
    }
}
