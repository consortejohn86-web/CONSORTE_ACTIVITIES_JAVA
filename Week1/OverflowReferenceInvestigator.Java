public class OverflowReferenceInvestigator {
  
public static void main(String[] args) {

        // 1. Demonstrate byte overflow
        byte number = 127;

        System.out.println("===== BYTE OVERFLOW =====");
        System.out.println("Before Increment: " + number);

        number++;

        // A byte can only store values from -128 to 127.
        // After 127, incrementing wraps around to -128.
        System.out.println("After Increment: " + number);


        // 2. Demonstrate String reference comparisons
        String text1 = new String("Java");
        String text2 = new String("Java");
        String text3 = "Java";

        System.out.println("\n===== STRING COMPARISONS =====");

        // text1 == text2 is false because new String() creates
        // two separate String objects in memory.
        System.out.println("text1 == text2: " + (text1 == text2));

        // text1.equals(text2) is true because both contain "Java".
        System.out.println("text1.equals(text2): " + text1.equals(text2));

        // text1 == text3 is false because text1 refers to an object
        // created with new, while text3 refers to the string literal.
        System.out.println("text1 == text3: " + (text1 == text3));

        // text1.equals(text3) is true because their text contents match.
        System.out.println("text1.equals(text3): " + text1.equals(text3));

        // text2 == text3 is false because text2 refers to a separate
        // object created with new, not the literal's pooled reference.
        System.out.println("text2 == text3: " + (text2 == text3));

        // text2.equals(text3) is true because both contain "Java".
        System.out.println("text2.equals(text3): " + text2.equals(text3));


        // 3. Demonstrate shared array references
        int[] array1 = {10, 20, 30};
        int[] array2 = array1;

        System.out.println("\n===== SHARED ARRAY REFERENCES =====");
        System.out.println("Before Modification: " + array2[0]);

        // Both variables refer to the same array object.
        // Modifying the array through array1 is visible through array2.
        array1[0] = 99;

        System.out.println("array1[0]: " + array1[0]);
        System.out.println("array2[0]: " + array2[0]);
    }
}
