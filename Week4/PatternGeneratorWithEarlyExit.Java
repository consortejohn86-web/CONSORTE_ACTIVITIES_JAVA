import java.util.Scanner;

public class PatternGeneratorWithEarlyExit {
    public static void main(String[] args) {

        int size = 5;

        for (int row = 1; row <= size; row++) {

            // CONTINUE: Skip row 3
            if (row == 3) {
                continue;
            }

            for (int column = 1; column <= row; column++) {

                // BREAK: Stop the inner loop at column 4
                if (column == 4) {
                    break;
                }

                System.out.print("* ");
            }

            System.out.println();
        }
    }
}

