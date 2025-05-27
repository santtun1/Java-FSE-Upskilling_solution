// Q27: Lambda Expressions
// Objective: Use functional programming features.
// Task: Sort a list of strings using a lambda expression.
// Instructions:
// - Create a List of strings.
// - Use Collections.sort() with a lambda to sort the list.
// - Display the sorted list.

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q27_LambdaExpressions {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Mango");
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        // Sort using lambda expression
        Collections.sort(fruits, (a, b) -> a.compareToIgnoreCase(b));

        System.out.println("Sorted fruits:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
