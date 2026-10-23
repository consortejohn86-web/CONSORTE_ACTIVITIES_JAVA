import java.util.Scanner;

public class WarehouseInventoryScanner {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // -1 means the shelf is damaged
        int[][] warehouse = {
            {10, 5, -1},
            {2, 0, 8},
            {1, 12, 4}
        };

        int choice;

        do {
            System.out.println("\n=== WAREHOUSE INVENTORY SCANNER ===");
            System.out.println("1. View Total Inventory");
            System.out.println("2. Find First Critically Low Shelf");
            System.out.println("3. Restock a Shelf");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    int total = 0;

                    // FOR + CONTINUE: Skip damaged shelves
                    for (int row = 0; row < warehouse.length; row++) {
                        for (int col = 0;
                             col < warehouse[row].length; col++) {

                            if (warehouse[row][col] == -1) {
                                continue;
                            }

                            total += warehouse[row][col];
                        }
                    }

                    System.out.println("Total Inventory: " + total);
                    break;

                case 2:
                    boolean found = false;

                    // Nested loops + BREAK: Find the first low shelf
                    for (int row = 0;
                         row < warehouse.length && !found; row++) {

                        for (int col = 0;
                             col < warehouse[row].length; col++) {

                            if (warehouse[row][col] == -1) {
                                continue;
                            }

                            if (warehouse[row][col] <= 2) {
                                System.out.println(
                                    "Critically low shelf found!"
                                );
                                System.out.println(
                                    "Row: " + (row + 1)
                                    + ", Column: " + (col + 1)
                                );
                                System.out.println(
                                    "Item Count: " + warehouse[row][col]
                                );

                                found = true;
                                break;
                            }
                        }
                    }

                    if (!found) {
                        System.out.println(
                            "No critically low shelf found."
                        );
                    }
                    break;

                case 3:
                    restockShelf(warehouse, input);
                    break;

                case 4:
                    System.out.println("Exiting inventory system...");
                    break;

                default:
                    System.out.println(
                        "Invalid choice. Please select 1 to 4."
                    );
            }

        } while (choice != 4);

        input.close();
    }

    // WHILE + RETURN: Validate and complete restocking
    public static void restockShelf(int[][] warehouse, Scanner input) {
        System.out.print("Enter shelf row (1-"
                + warehouse.length + "): ");
        int row = input.nextInt();

        System.out.print("Enter shelf column (1-"
                + warehouse[0].length + "): ");
        int col = input.nextInt();

        // Validate shelf position
        if (row < 1 || row > warehouse.length
                || col < 1 || col > warehouse[row - 1].length) {
            System.out.println("Invalid shelf position.");
            return;
        }

        // Do not allow restocking a damaged shelf
        if (warehouse[row - 1][col - 1] == -1) {
            System.out.println(
                "Cannot restock. This shelf is damaged."
            );
            return;
        }

        System.out.print("Enter quantity to add: ");
        int quantity = input.nextInt();

        // WHILE: Keep asking until the quantity is positive
        while (quantity <= 0) {
            System.out.println(
                "Invalid quantity. Enter a number greater than 0."
            );
            System.out.print("Enter quantity to add: ");
            quantity = input.nextInt();
        }

        warehouse[row - 1][col - 1] += quantity;

        System.out.println("Restocking successful!");
        System.out.println(
            "Updated shelf count: "
            + warehouse[row - 1][col - 1]
        );

        return;
    }
}

