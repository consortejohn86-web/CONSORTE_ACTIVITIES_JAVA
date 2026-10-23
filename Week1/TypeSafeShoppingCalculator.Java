public class TypeSafeShoppingCalculator {
  
    public static void main(String[] args) {

        // Declare and initialize variables
        int quantity = 3;
        double unitPrice = 49.50;
        String storeName = "Consorte Store";

        // Compute the total cost
        double totalCost = quantity * unitPrice;

        // totalCost should not be an int because the total may contain decimal values.
        // Using double preserves the decimal part of the calculation.

        // Print the itemized summary
        System.out.println("===== SHOPPING SUMMARY =====");
        System.out.println("Store Name: " + storeName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Unit Price: PHP " + unitPrice);
        System.out.println("Total Cost: PHP " + totalCost);
    }
}  
