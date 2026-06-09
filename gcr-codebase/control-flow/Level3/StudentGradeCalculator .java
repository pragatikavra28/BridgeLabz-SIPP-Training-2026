import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input marks
        System.out.print("Enter Physics Marks: ");
        double physics = sc.nextDouble();

        System.out.print("Enter Chemistry Marks: ");
        double chemistry = sc.nextDouble();

        System.out.print("Enter Maths Marks: ");
        double maths = sc.nextDouble();

        // Calculate total, average and percentage
        double total = physics + chemistry + maths;
        double average = total / 3;
        double percentage = (total / 300) * 100;

        String grade;
        String remarks;

        // Determine grade and remarks
        if (percentage >= 80) {
            grade = "A";
            remarks = "Level 4, above agency-normalized standards";
        } else if (percentage >= 70) {
            grade = "B";
            remarks = "Level 3, at agency-normalized standards";
        } else if (percentage >= 60) {
            grade = "C";
            remarks = "Level 2, below but approaching agency-normalized standards";
        } else if (percentage >= 50) {
            grade = "D";
            remarks = "Level 1, well below agency-normalized standards";
        } else if (percentage >= 40) {
            grade = "E";
            remarks = "Level 1-, too below agency-normalized standards";
        } else {
            grade = "R";
            remarks = "Remedial standards";
        }

        // Display result
        System.out.println("\n===== RESULT =====");
        System.out.println("Total Marks    : " + total + "/300");
        System.out.println("Average Marks  : " + average);
        System.out.println("Percentage     : " + percentage + "%");
        System.out.println("Grade          : " + grade);
        System.out.println("Remarks        : " + remarks);

        sc.close();
    }
}