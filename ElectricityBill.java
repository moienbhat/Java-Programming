class ElectricityBill {
    String consumerType;
    int units;

    ElectricityBill(String consumerType, int units) {
        this.consumerType = consumerType;
        this.units = units;
    }

    double calculateBill() {
        double amount;

        if (units <= 100) amount = units * 2;
        else if (units <= 200) amount = 100 * 2 + (units - 100) * 3;
        else amount = 100 * 2 + 100 * 3 + (units - 200) * 5;

        return amount;
    }

    double subsidy(double amount) {
        if (consumerType.equalsIgnoreCase("domestic")) return 0.1 * amount;
        return 0;
    }

    double tax(double amount) {
        return 0.05 * amount;
    }

    double lateFee(double amount) {
        return 0.02 * amount;
    }

    void generateBill() {
        double base = calculateBill();
        double sub = subsidy(base);
        double taxed = tax(base - sub);
        double late = lateFee(base);
        double finalAmount = base - sub + taxed + late;

        System.out.println("Consumer Type: " + consumerType);
        System.out.println("Units: " + units);
        System.out.println("Base Amount: " + base);
        System.out.println("Subsidy: " + sub);
        System.out.println("Tax: " + taxed);
        System.out.println("Late Fee: " + late);
        System.out.println("Final Payable Amount: " + finalAmount);
    }

    public static void main(String[] args) {
        ElectricityBill e = new ElectricityBill("domestic", 250);
        e.generateBill();
    }
}