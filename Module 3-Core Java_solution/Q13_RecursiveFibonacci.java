// Q13: Recursive Fibonacci
// Objective: Implement recursion.
// Task: Calculate the nth Fibonacci number using recursion.
// Instructions:
// - Prompt the user for a positive integer n.
// - Define a recursive method fibonacci(int n) that returns the nth Fibonacci number.
// - Display the result.

import java.util.Scanner;

public class Q13_RecursiveFibonacci {
    // Recursive method to calculate Fibonacci number
    public static int fibonacci(int n) {
        if (n <= 1)
            return n;
        else
            return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for a positive integer
        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();

        // Display the nth Fibonacci number
        System.out.println("Fibonacci number at position " + n + " is: " + fibonacci(n));

        scanner.close();
    }
}
