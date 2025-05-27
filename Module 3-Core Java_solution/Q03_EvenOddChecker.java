// Q03: Even or Odd Checker
// Objective: Utilize conditional statements.
// Task: Determine if a number entered by the user is even or odd.
// Instructions:
// - Prompt the user for an integer.
// - Use the modulus operator % to check divisibility by 2.
// - Display whether the number is even or odd.

import java.util.Scanner;

public class Q03_EvenOddChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for an integer
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // Check if the number is even or odd
        if (number % 2 == 0) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }

        scanner.close();
    }
}
