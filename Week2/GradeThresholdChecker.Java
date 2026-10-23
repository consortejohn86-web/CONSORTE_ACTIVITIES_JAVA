import java.util.Scanner;

public class GradeThresholdChecker {
    public static void main(String[] args) {

        // Declare variables for the student's grade and absences
        double average = 85;
        int absences = 2;

        // Check if the student meets the passing requirements
        boolean passed = (average >= 75 && absences <= 3) || (average >= 90);

        // Display the student's information
        System.out.println("===== GRADE THRESHOLD CHECKER =====");
        System.out.println("Average Grade: " + average);
        System.out.println("Number of Absences: " + absences);

        // Display the result and reasoning
        if (passed) {
            System.out.println("Result: PASS");

            if (average >= 90) {
                System.out.println("Reason: The average grade is 90 or above.");
            } else {
                System.out.println("Reason: The average is at least 75 and absences are 3 or fewer.");
            }

        } else {
            System.out.println("Result: FAIL");
            System.out.println("Reason: The student does not meet either passing condition.");
        }
    }
}


