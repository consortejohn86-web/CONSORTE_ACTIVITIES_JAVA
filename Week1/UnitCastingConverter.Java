public class UnitCastingConverter {
    
 public static void main(String[] args) {

        // Declare a double value representing centimeters
        double centimeters = 275.8;

        // Explicit casting to get the whole meters
        int wholeMeters = (int) (centimeters / 100);

        // Calculate the remaining centimeters
        double remainingCentimeters = centimeters - (wholeMeters * 100);

        // Print the converted measurement
        System.out.println("===== UNIT CASTING CONVERTER =====");
        System.out.println("Original Measurement: " + centimeters + " cm");
        System.out.println("Whole Meters: " + wholeMeters + " m");
        System.out.println("Remaining Centimeters: " + remainingCentimeters + " cm");

        // Implicit widening: int to double
        // No cast is needed because double can store whole numbers and decimal values.
        int number = 25;
        double widenedNumber = number;

        System.out.println("\n===== IMPLICIT WIDENING =====");
        System.out.println("Integer Value: " + number);
        System.out.println("Double Value: " + widenedNumber);

        // Explicit narrowing: double to int
        // The decimal portion is lost because casting from double to int truncates
        // the value toward zero instead of rounding it.
        double decimalValue = 19.75;
        int narrowedValue = (int) decimalValue;

        System.out.println("\n===== EXPLICIT NARROWING =====");
        System.out.println("Original Double: " + decimalValue);
        System.out.println("Narrowed Integer: " + narrowedValue);
    }
}
