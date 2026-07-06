package mainapp;

import employee.SalaryCalculator;
import employee.PermanentEmployee;
import employee.ContractEmployee;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Employee ID: ");
        String id = sc.nextLine();
        System.out.print("Employee Type (1-Permanent / 2-Contract): ");
        int type = sc.nextInt();

        if (type == 1) {
            System.out.print("Enter Basic Pay: ");
            double basic = sc.nextDouble();
            PermanentEmployee pe = new PermanentEmployee(name, id, basic);
            pe.displaySalary();
            SalaryCalculator sc2 = pe;
            System.out.printf("[Polymorphism] Salary via interface: Rs. %.2f%n", sc2.calculateSalary());
        } else {
            System.out.print("Enter Hours Worked: ");
            int hours = sc.nextInt();
            System.out.print("Enter Hourly Rate: ");
            double rate = sc.nextDouble();
            ContractEmployee ce = new ContractEmployee(name, id, hours, rate);
            ce.displaySalary();
            SalaryCalculator sc2 = ce;
            System.out.printf("[Polymorphism] Salary via interface: Rs. %.2f%n", sc2.calculateSalary());
        }
        sc.close();
    }
}
