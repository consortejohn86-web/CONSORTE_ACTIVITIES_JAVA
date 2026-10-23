class Student {
    String name;
    int[] quizzes;
    double average;

    Student(String name, int[] quizzes) {
        this.name = name;
        this.quizzes = quizzes;

        int sum = 0;

        for (int i = 0; i < quizzes.length; i++) {
            sum += quizzes[i];
        }

        this.average = (double) sum / quizzes.length;
    }
}

public class ClassRankingSystem {

    public static void main(String[] args) {

        String[] names = {
            "Anna", "Ben", "Carlo", "Diana", "Ella"
        };

        int[][] quizData = {
            {90, 85, 88, 92},
            {80, 82, 84, 86},
            {90, 85, 88, 92},
            {75, 80, 78, 81},
            {88, 90, 85, 87}
        };

        // Create Student objects from the 2D quiz array.
        Student[] students = new Student[quizData.length];

        for (int i = 0; i < students.length; i++) {
            students[i] = new Student(names[i], quizData[i]);
        }

        // Own sorting algorithm: Bubble Sort.
        // Sort from highest average to lowest average.
        for (int i = 0; i < students.length - 1; i++) {
            for (int j = 0; j < students.length - 1 - i; j++) {

                if (students[j].average < students[j + 1].average) {
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }

        // Display the leaderboard.
        System.out.println("========== CLASS LEADERBOARD ==========");
        System.out.printf("%-8s %-12s %-10s%n",
                "Rank", "Name", "Average");
        System.out.println("---------------------------------------");

        int rank = 1;

        for (int i = 0; i < students.length; i++) {

            // Students with equal averages share the same rank.
            if (i > 0 &&
                students[i].average != students[i - 1].average) {
                rank = i + 1;
            }

            System.out.printf("%-8d %-12s %-10.2f%n",
                    rank, students[i].name, students[i].average);
        }

        // Search for a student using our own linear search.
        String targetName = "Carlo";
        int studentRank = findStudentRank(students, targetName);

        System.out.println("---------------------------------------");

        if (studentRank != -1) {
            System.out.println(targetName + "'s Rank: " + studentRank);
        } else {
            System.out.println(targetName + " was not found.");
        }
    }

    // Own linear search that returns the student's rank.
    public static int findStudentRank(Student[] students,
                                      String targetName) {
        int rank = 1;

        for (int i = 0; i < students.length; i++) {

            if (i > 0 &&
                students[i].average != students[i - 1].average) {
                rank = i + 1;
            }

            if (students[i].name.equalsIgnoreCase(targetName)) {
                return rank;
            }
        }

        return -1;
    }
}

    
