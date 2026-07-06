package electricity;

public class CommercialConsumer implements BillCalculator {
    private String name;
    private String consumerId;

    public CommercialConsumer(String name, String consumerId) {
        this.name = name;
        this.consumerId = consumerId;
    }

    @Override
    public double calculateBill(int units) {
        return units * 9.0;
    }

    public void displayBill(int units) {
        System.out.println("======================================");
        System.out.println("      ELECTRICITY BILL - COMMERCIAL   ");
        System.out.println("======================================");
        System.out.println("Consumer Name : " + name);
        System.out.println("Consumer ID   : " + consumerId);
        System.out.println("Consumer Type : Commercial");
        System.out.println("Units Consumed: " + units);
        System.out.println("Rate per Unit : Rs. 9");
        System.out.printf("Total Bill    : Rs. %.2f%n", calculateBill(units));
        System.out.println("======================================");
    }
}
