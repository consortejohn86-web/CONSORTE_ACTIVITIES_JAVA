public class ATMTransactionAuthorizer {
    
 public static void main(String[] args) {

        String correctUsername = "John Consorte";
        String correctPIN = "1234";

        String username = "John Consorte";
        String pin = "1234";

        double balance = 8000.00;
        double withdrawalAmount = 1500.00;
        double dailyWithdrawn = 500.00;

        String accountTier = "";
        String denialReason = "";
        double dailyLimit = 0.0;
        double feeRate = 0.0;
        double transactionFee = 0.0;
        double totalDeduction = 0.0;

        boolean authorized = false;
        boolean approved = false;

        // 1. Check username and PIN using nested if
        if (username.equals(correctUsername)) {
            if (pin.equals(correctPIN)
                    && pin.length() == 4
                    && pin.matches("[0-9]{4}")) {
                authorized = true;
            } else {
                denialReason = "Incorrect PIN.";
            }
        } else {
            denialReason = "Incorrect username.";
        }

        // 2. Determine account tier using an else-if ladder
        if (authorized) {
            if (balance < 1000) {
                accountTier = "Bronze";
            } else if (balance < 5000) {
                accountTier = "Silver";
            } else if (balance < 10000) {
                accountTier = "Gold";
            } else {
                accountTier = "Platinum";
            }

            // 3. Set the daily limit based on account tier
            switch (accountTier) {
                case "Bronze":
                    dailyLimit = 500.00;
                    break;
                case "Silver":
                    dailyLimit = 2000.00;
                    break;
                case "Gold":
                    dailyLimit = 5000.00;
                    break;
                case "Platinum":
                    dailyLimit = 10000.00;
                    break;
                default:
                    denialReason = "Invalid account tier.";
            }

            // 4. Use switch to determine transaction fee percentage
            switch (accountTier) {
                case "Bronze":
                    feeRate = 0.02;
                    break;
                case "Silver":
                    feeRate = 0.015;
                    break;
                case "Gold":
                    feeRate = 0.01;
                    break;
                case "Platinum":
                    feeRate = 0.005;
                    break;
                default:
                    feeRate = 0.0;
                    break;
            }

            // 5. Calculate the transaction fee
            transactionFee = withdrawalAmount * feeRate;
            totalDeduction = withdrawalAmount + transactionFee;

            // 6. Nested if: check balance and daily limit
            if (denialReason.isEmpty()) {
                if (withdrawalAmount > 0) {
                    if (totalDeduction <= balance) {
                        if (dailyWithdrawn + withdrawalAmount
                                <= dailyLimit) {
                            approved = true;
                        } else {
                            denialReason =
                                "Daily withdrawal limit exceeded.";
                        }
                    } else {
                        denialReason =
                                "Insufficient balance to cover withdrawal and fee.";
                    }
                } else {
                    denialReason =
                            "Withdrawal amount must be greater than zero.";
                }
            }
        }

        // 7. Final if-else: approve or deny
        System.out.println("Account Tier: "
                + (accountTier.isEmpty() ? "Not assigned" : accountTier));

        if (approved) {
            System.out.println("Transaction Status: APPROVED");
            System.out.printf("Withdrawal Amount: %.2f%n",
                    withdrawalAmount);
            System.out.printf("Transaction Fee: %.2f%n",
                    transactionFee);
            System.out.printf("Total Deduction: %.2f%n",
                    totalDeduction);
            System.out.printf("Remaining Balance: %.2f%n",
                    balance - totalDeduction);
        } else {
            System.out.println("Transaction Status: DENIED");
            System.out.println("Reason: " + denialReason);
        }
    }
}


