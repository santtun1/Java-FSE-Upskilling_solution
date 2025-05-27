// 23. File Reading
// Objective: Read data from a file.
// Task: Read and display the contents of output.txt.
// Instructions:
// - Open output.txt for reading.
// - Read each line and display it on the console.

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Q23_FileReading {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("output.txt"))) {
            String line;
            System.out.println("Contents of output.txt:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
        }
    }
}
