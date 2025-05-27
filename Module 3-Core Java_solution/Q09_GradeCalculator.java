// Q09: Grade Calculator
// Objective: Use conditional statements to determine grades.
// Task: Assign grades based on marks entered by the user.
// Instructions:
// - Prompt the user for marks out of 100.
// - Use if-else statements to assign grades:
//   ▪ 90-100: A
//   ▪ 80-89: B
//   ▪ 70-79: C
//   ▪ 60-69: D
//   ▪ Below 60: F
// - Display the assigned grade.

import java.util.Scanner;

public class Q09_GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for marks
        System.out.print("Enter marks out of 100: ");
        int marks = scanner.nextInt();
        String grade;

        // Determine the grade
        if (marks >= 90 && marks <= 100) {
            grade = "A";
        } else if (marks >= 80) {
            grade = "B";
        } else if (marks >= 70) {
            grade = "C";
        } else if (marks >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }

        // Display the grade
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}
