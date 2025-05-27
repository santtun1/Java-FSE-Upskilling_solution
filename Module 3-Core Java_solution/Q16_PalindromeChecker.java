// 16. Palindrome Checker
// Objective: Combine string manipulation and conditional logic.
// Task: Check if a string is a palindrome.
// Instructions:
// - Prompt the user for a string.
// - Remove any non-alphanumeric characters and convert to lowercase.
// - Check if the string reads the same forwards and backwards.
// - Display the result.

import java.util.Scanner;

public class Q16_PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String original = scanner.nextLine();
        String cleaned = original.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reversed = new StringBuilder(cleaned).reverse().toString();

        if (cleaned.equals(reversed)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
        scanner.close();
    }
}
