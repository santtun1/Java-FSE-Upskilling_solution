// 15. String Reversal
// Objective: Manipulate strings.
// Task: Reverse a string entered by the user.
// Instructions:
// - Prompt the user for a string.
// - Use a loop or StringBuilder to reverse the string.
// - Display the reversed string.

import java.util.Scanner;

public class Q15_StringReversal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        String reversed = new StringBuilder(input).reverse().toString();
        System.out.println("Reversed string: " + reversed);
        scanner.close();
    }
}
