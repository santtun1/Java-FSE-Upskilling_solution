// Q24: ArrayList Example
// Objective: Use dynamic arrays.
// Task: Manage a list of student names.
// Instructions:
// - Create an ArrayList to store names.
// - Allow the user to add names to the list.
// - Display all names entered.

import java.util.ArrayList;
import java.util.Scanner;

public class Q24_ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter student names (type 'done' to finish):");
        while (true) {
            String input = scanner.nextLine();
            if ("done".equalsIgnoreCase(input)) {
                break;
            }
            names.add(input);
        }

        System.out.println("Student Names Entered:");
        for (String name : names) {
            System.out.println(name);
        }
        scanner.close();
    }
}
