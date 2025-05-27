// 20. Try-Catch Example
// Objective: Handle exceptions gracefully.
// Task: Handle division by zero using try-catch.
// Instructions:
// - Prompt the user for two integers.
// - Attempt to divide the first by the second.
// - Catch any ArithmeticException and display an appropriate message.

import java.util.Scanner;

public class Q20_TryCatchExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter numerator: ");
        int numerator = scanner.nextInt();
        System.out.print("Enter denominator: ");
        int denominator = scanner.nextInt();

        try {
            int result = numerator / denominator;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }
        scanner.close();
    }
}
