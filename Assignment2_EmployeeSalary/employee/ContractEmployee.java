package employee;

public class ContractEmployee implements SalaryCalculator {
    private String name;
    private String empId;
    private int hoursWorked;
    private double hourlyRate;

    public ContractEmployee(String name, String empId, int hoursWorked, double hourlyRate) {
        this.name = name;
        this.empId = empId;
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return hoursWorked * hourlyRate;
    }

    public void displaySalary() {
        System.out.println("======================================");
        System.out.println("     SALARY SLIP - CONTRACT EMPLOYEE  ");
        System.out.println("======================================");
        System.out.println("Name         : " + name);
        System.out.println("Employee ID  : " + empId);
        System.out.println("Hours Worked : " + hoursWorked);
        System.out.printf("Hourly Rate  : Rs. %.2f%n", hourlyRate);
        System.out.printf("Total Salary : Rs. %.2f%n", calculateSalary());
        System.out.println("======================================");
    }
}
