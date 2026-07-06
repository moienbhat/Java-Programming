package employee;

public class PermanentEmployee implements SalaryCalculator {
    private String name;
    private String empId;
    private double basicPay;

    public PermanentEmployee(String name, String empId, double basicPay) {
        this.name = name;
        this.empId = empId;
        this.basicPay = basicPay;
    }

    @Override
    public double calculateSalary() {
        double hra = basicPay * 0.20;
        double da  = basicPay * 0.10;
        return basicPay + hra + da;
    }

    public void displaySalary() {
        double hra = basicPay * 0.20;
        double da  = basicPay * 0.10;
        System.out.println("======================================");
        System.out.println("     SALARY SLIP - PERMANENT EMPLOYEE ");
        System.out.println("======================================");
        System.out.println("Name         : " + name);
        System.out.println("Employee ID  : " + empId);
        System.out.printf("Basic Pay    : Rs. %.2f%n", basicPay);
        System.out.printf("HRA (20%%)   : Rs. %.2f%n", hra);
        System.out.printf("DA  (10%%)   : Rs. %.2f%n", da);
        System.out.printf("Gross Salary : Rs. %.2f%n", calculateSalary());
        System.out.println("======================================");
    }
}
