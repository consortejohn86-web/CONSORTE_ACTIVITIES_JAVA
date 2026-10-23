public class MultiTierDiscountSystem {
    
public static void main(String[] args) {

        double purchaseAmount = 2500.00;
        double discountRate;
        String discountTier;

        if (purchaseAmount < 1000) {
            discountRate = 0.0;
            discountTier = "No Discount";
        } else if (purchaseAmount < 2000) {
            discountRate = 0.05;
            discountTier = "5% Discount";
        } else if (purchaseAmount < 5000) {
            discountRate = 0.10;
            discountTier = "10% Discount";
        } else {
            discountRate = 0.15;
            discountTier = "15% Discount";
        }

        double discountAmount = purchaseAmount * discountRate;
        double finalPrice = purchaseAmount - discountAmount;

        System.out.println("Purchase Amount: " + purchaseAmount);
        System.out.println("Discount Tier: " + discountTier);
        System.out.println("Discount Amount: " + discountAmount);
        System.out.println("Final Discounted Price: " + finalPrice);
    }
}
