// Q30: Pattern Matching for switch (Java 21)
// Objective: Simplify conditional logic with pattern matching in enhanced switch expressions.
// Task: Determine the type of an object and respond accordingly.
// Instructions:
// - Create a method that accepts Object as input.
// - Use a switch expression to check if the object is Integer, String, Double, etc.
// - Print a message based on the object’s type.

public class Q30_PatternMatchingSwitch {
    public static void printType(Object obj) {
        String result = switch (obj) {
            case Integer i -> "Integer: " + i;
            case String s -> "String: " + s;
            case Double d -> "Double: " + d;
            case null -> "Null value";
            default -> "Unknown type: " + obj.getClass().getSimpleName();
        };
        System.out.println(result);
    }

    public static void main(String[] args) {
        printType(42);
        printType("Hello");
        printType(3.14);
        printType(true);
        printType(null);
    }
}
