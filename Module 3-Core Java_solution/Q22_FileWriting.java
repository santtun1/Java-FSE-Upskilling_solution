// 22. File Writing
// Objective: Write data to a file.
// Task: Write user input to a text file.
// Instructions:
// - Prompt the user for a string.
// - Write the string to a file named output.txt.
// - Confirm that the data has been written.

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Q22_FileWriting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text to write to file: ");
        String input = scanner.nextLine();

        try (FileWriter writer = new FileWriter("output.txt")) {
            writer.write(input);
            System.out.println("Data written to output.txt successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
        }
        scanner.close();
    }
}
