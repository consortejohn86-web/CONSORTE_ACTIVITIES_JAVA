public class PrecedencePuzzleSolver {
    public static void main(String[] args) {

        System.out.println("===== PRECEDENCE PUZZLE SOLVER =====");

        int a = 5;
        int b = 3;

        // PREDICTED: true
        System.out.println("Expression 1: " + (a + b * 2 > 10));
        // Multiplication happens before addition, then comparison.
        // 5 + (3 * 2) = 11, and 11 > 10 is true.

        // PREDICTED: true
        System.out.println("Expression 2: " + (a > 3 && b < 5));
        // Relational operators are evaluated before logical AND.
        // true && true = true.

        int count = 4;

        // PREDICTED: 6
        System.out.println("Expression 3: " + (count++ + 2));
        // Postfix ++ uses the old value (4) in the expression, then increments count.
        // 4 + 2 = 6.

        // PREDICTED: 5
        System.out.println("Count after postfix increment: " + count);

        int x = 2;

        // PREDICTED: true
        System.out.println("Expression 4: " + (++x == 3 || x * 2 > 10));
        // Prefix ++ increments x first, making it 3.
        // 3 == 3 is true, so || short-circuits without evaluating the right side.

        // PREDICTED: 3
        System.out.println("Value of x after prefix increment: " + x);
    }
}

