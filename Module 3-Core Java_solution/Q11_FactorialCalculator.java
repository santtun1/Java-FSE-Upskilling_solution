// Q11: Factorial Calculator
// Objective: Use loops to perform repetitive calculations.
// Task: Calculate the factorial of a number entered by the user.
// Instructions:
// - Prompt the user for a non-negative integer.
// - Use a for loop to calculate the factorial.
// - Display the result.

import java.util.Scanner;

public class Q11_FactorialCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for a non-negative integer
        System.out.print("Enter a non-negative integer: ");
        int number = scanner.nextInt();
        long factorial = 1;

        // Calculate the factorial
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        // Display the result
        System.out.println("Factorial of " + number + " is: " + factorial);

        scanner.close();
    }
}
