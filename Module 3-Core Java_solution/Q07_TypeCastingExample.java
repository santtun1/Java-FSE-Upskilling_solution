// Q07: Type Casting Example
// Objective: Practice type casting between different data types.
// Task: Convert a double to an int and vice versa.
// Instructions:
// - Declare a double variable with a decimal value.
// - Cast it to an int and display the result.
// - Declare an int variable and cast it to a double, then display.

public class Q07_TypeCastingExample {
    public static void main(String[] args) {
        double doubleValue = 9.78;
        int intValue = (int) doubleValue; // Narrowing casting
        System.out.println("Double value: " + doubleValue);
        System.out.println("Converted to int: " + intValue);

        int anotherInt = 10;
        double convertedDouble = anotherInt; // Widening casting
        System.out.println("Int value: " + anotherInt);
        System.out.println("Converted to double: " + convertedDouble);
    }
}
