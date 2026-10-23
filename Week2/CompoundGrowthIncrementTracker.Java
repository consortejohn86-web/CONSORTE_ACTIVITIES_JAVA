public class CompoundGrowthIncrementTracker {
    public static void main(String[] args) {

        // Initial balance
        double balance = 1000.0;

        System.out.println("===== COMPOUND GROWTH TRACKER =====");
        System.out.println("Initial Balance: " + balance);

        // Step 1: Add 200 to the balance
        balance += 200;
        System.out.println("After Step 1 (+200): " + balance);

        // Step 2: Increase the balance by 10%
        balance *= 1.10;
        System.out.println("After Step 2 (+10%): " + balance);

        // Step 3: Add 300 to the balance
        balance += 300;
        System.out.println("After Step 3 (+300): " + balance);

        System.out.println("\n===== POSTFIX INCREMENT =====");

        int count = 5;

        System.out.println("count++: " + count++);
        // Postfix prints the current value first, then increments count.
        System.out.println("Count after count++: " + count);

        System.out.println("\n===== PREFIX INCREMENT =====");

        count = 5;

        System.out.println("++count: " + ++count);
        // Prefix increments count first, then prints the new value.
        System.out.println("Count after ++count: " + count);
    }
}
