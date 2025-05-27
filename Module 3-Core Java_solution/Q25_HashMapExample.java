// Q25: HashMap Example
// Objective: Use key-value pairs.
// Task: Map student IDs to names.
// Instructions:
// - Create a HashMap with Integer keys and String values.
// - Allow the user to add entries.
// - Retrieve and display a name based on an entered ID.

import java.util.HashMap;
import java.util.Scanner;

public class Q25_HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer, String> studentMap = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter student ID and name (type -1 as ID to stop):");
        while (true) {
            System.out.print("Enter ID: ");
            int id = scanner.nextInt();
            scanner.nextLine(); // consume newline
            if (id == -1) break;

            System.out.print("Enter Name: ");
            String name = scanner.nextLine();
            studentMap.put(id, name);
        }

        System.out.print("Enter student ID to retrieve name: ");
        int searchId = scanner.nextInt();

        if (studentMap.containsKey(searchId)) {
            System.out.println("Student Name: " + studentMap.get(searchId));
        } else {
            System.out.println("ID not found.");
        }
        scanner.close();
    }
}
