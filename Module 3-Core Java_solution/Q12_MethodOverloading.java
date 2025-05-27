// Q12: Method Overloading
// Objective: Understand method overloading in Java.
// Task: Create multiple methods with the same name but different parameters.
// Instructions:
// - Define methods named add that accept:
//   ▪ Two integers.
//   ▪ Two doubles.
//   ▪ Three integers.
// - Each method should return the sum of its parameters.
// - Call each method and display the results.

public class Q12_MethodOverloading {
    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to add two doubles
    public double add(double a, double b) {
        return a + b;
    }

    // Method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Q12_MethodOverloading calculator = new Q12_MethodOverloading();

        System.out.println("Sum of two integers: " + calculator.add(5, 10));
        System.out.println("Sum of two doubles: " + calculator.add(5.5, 10.5));
        System.out.println("Sum of three integers: " + calculator.add(1, 2, 3));
    }
}
