// 14. Array Sum and Average
// Objective: Work with arrays and perform calculations.
// Task: Calculate the sum and average of elements in an array.
// Instructions:
// - Prompt the user to enter the number of elements.
// - Read the elements into an array.
// - Calculate and display the sum and average.

import java.util.Scanner;

public class Q14_ArraySumAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        int sum = 0;

        System.out.println("Enter " + n + " numbers:");
        for(int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
            sum += numbers[i];
        }

        double average = (double) sum / n;
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
        scanner.close();
    }
}
