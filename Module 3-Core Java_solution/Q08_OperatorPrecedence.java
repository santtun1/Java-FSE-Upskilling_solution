// Q08: Operator Precedence
// Objective: Explore how Java evaluates expressions.
// Task: Evaluate and display the result of complex expressions.
// Instructions:
// - Write expressions combining multiple operators, e.g., int result = 10 + 5 * 2;
// - Display the result and explain the order of operations.

public class Q08_OperatorPrecedence {
    public static void main(String[] args) {
        int result1 = 10 + 5 * 2; // Multiplication has higher precedence than addition
        System.out.println("10 + 5 * 2 = " + result1);

        int result2 = (10 + 5) * 2; // Parentheses change the order of operations
        System.out.println("(10 + 5) * 2 = " + result2);

        int result3 = 100 / 5 + 2 * 3; // Division and multiplication have same precedence, evaluated left to right
        System.out.println("100 / 5 + 2 * 3 = " + result3);
    }
}
