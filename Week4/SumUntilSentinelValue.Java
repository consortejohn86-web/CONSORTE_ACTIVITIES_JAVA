import java.util.Scanner;

public class SumUntilSentinelValue {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number = 0;
        int total = 0;

        while (number != -1) {
            System.out.print("Enter an integer (-1 to stop): ");
            number = input.nextInt();

            if (number != -1) {
                total = total + number;
            }
        }

        System.out.println("Final Total: " + total);

        input.close();
    }
}
