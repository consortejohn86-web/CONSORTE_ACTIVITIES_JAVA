import java.util.Arrays;

public class SearchSortMiniTool {
    public static void main(String[] args) {

        int[] scores = {85, 90, 78, 92, 88, 76, 95, 80};

        int target = 92;
        int foundIndex = -1;

        // Linear search: check each score until the target is found.
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] == target) {
                foundIndex = i;
                break;
            }
        }

        if (foundIndex != -1) {
            System.out.println("Target Score: " + target);
            System.out.println("Status: Found");
            System.out.println("Index: " + foundIndex);
        } else {
            System.out.println("Target Score: " + target);
            System.out.println("Status: Not Found");
        }

        // Sort a copy to preserve the original array and its original order.
        int[] sortedScores = Arrays.copyOf(scores, scores.length);
        Arrays.sort(sortedScores);

        System.out.println("\nOriginal Array: " + Arrays.toString(scores));
        System.out.println("Sorted Array: " + Arrays.toString(sortedScores));
    }
} 
