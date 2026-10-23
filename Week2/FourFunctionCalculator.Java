import java.util.Scanner;

public class FourFunctionCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Read two integers from the user
        System.out.print("Enter the first integer: ");
        int num1 = input.nextInt();

        System.out.print("Enter the second integer: ");
        int num2 = input.nextInt();

        // Perform basic arithmetic operations
        System.out.println("\n===== CALCULATOR RESULTS =====");

        System.out.println("Addition (+): " + (num1 + num2));
        System.out.println("Subtraction (-): " + (num1 - num2));
        System.out.println("Multiplication (*): " + (num1 * num2));

        // Integer division truncates the decimal part.
        // Division by zero is not allowed.
        if (num2 != 0) {
            System.out.println("Division (/): " + (num1 / num2));

            // Modulus (%) gives the remainder.
            // With negative operands, Java's remainder
            // follows the sign of the dividend (num1).
            System.out.println("Modulus (%): " + (num1 % num2));
        } else {
            System.out.println("Division (/): Undefined (cannot divide by zero)");
            System.out.println("Modulus (%): Undefined (cannot divide by zero)");
        }

        input.close();
    }
}
