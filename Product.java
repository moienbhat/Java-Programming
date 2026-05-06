class Product {
    int productId;
    int quantity;
    double pricePerUnit;
    boolean isExpired;
    String category;

    Product(int productId, int quantity, double pricePerUnit, boolean isExpired, String category) {
        this.productId = productId;
        this.quantity = quantity;
        this.pricePerUnit = pricePerUnit;
        this.isExpired = isExpired;
        this.category = category;
    }

    double totalCost() {
        return quantity * pricePerUnit;
    }

    double discount(double amount) {
        if (category.equalsIgnoreCase("A")) return 0.2 * amount;
        else if (category.equalsIgnoreCase("B")) return 0.1 * amount;
        else return 0.05 * amount;
    }

    double tax(double amount) {
        return 0.08 * amount;
    }

    void generateInvoice() {
        double total = totalCost();
        double disc = discount(total);

        if (isExpired) {
            disc += 0.1 * total;
        }

        double taxable = total - disc;
        double taxAmount = tax(taxable);
        double finalAmount = taxable + taxAmount;

        System.out.println("Product ID: " + productId);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price per Unit: " + pricePerUnit);
        System.out.println("Total Cost: " + total);
        System.out.println("Discount: " + disc);
        System.out.println("Tax: " + taxAmount);
        System.out.println("Final Amount: " + finalAmount);
    }

    public static void main(String[] args) {
        Product p = new Product(101, 5, 200, false, "A");
        p.generateInvoice();
    }
}