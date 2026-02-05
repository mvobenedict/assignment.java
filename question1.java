public class GradeReport {

    // High-level method
    public static void executeGradeReport(double score) {

        if (!validateScore(score)) {
            System.out.println("Invalid Score");
            return;
        }

        char grade = calculateLetterGrade(score);

        displayPerformanceMessage(grade);
    }

    // Validate score
    public static boolean validateScore(double score) {
        return score >= 0 && score <= 100;
    }

    // Calculate letter grade
    public static char calculateLetterGrade(double score) {
        if (score >= 90) return 'A';
        else if (score >= 80) return 'B';
        else if (score >= 70) return 'C';
        else if (score >= 60) return 'D';
        else return 'F';
    }

    // Display message
    public static void displayPerformanceMessage(char grade) {
        System.out.println("Your grade is: " + grade);
    }

    // Test
    public static void main(String[] args) {
        executeGradeReport(85);
    }
}
