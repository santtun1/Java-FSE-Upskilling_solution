// Q04: Leap Year Checker
// Objective: Apply nested conditional logic.
// Task: Check if a given year is a leap year.
// Instructions:
// - Prompt the user to enter a year.
// - A year is a leap year if it's divisible by 4 but not by 100, unless it's also divisible by 400.
// - Display the result accordingly.

import java.util.Scanner;

public class Q04_LeapYearChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a year
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        // Check if the year is a leap year
        boolean isLeapYear;

        if (year % 4 == 0) {
            if (year % 100 != 0) {
                isLeapYear = true;
            } else {
                isLeapYear = (year % 400 == 0);
            }
        } else {
            isLeapYear = false;
        }

        // Display the result
        if (isLeapYear) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }

        scanner.close();
    }
}
