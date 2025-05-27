// Q37: Using javap to Inspect Bytecode
// Objective: Explore compiled .class files.
// Task: Compile a Java class and inspect its bytecode using javap.
// Instructions:
// - Create a class with a method.
// - Compile it and run javap -c ClassName.
// - Interpret the bytecode output.

public class Q37_InspectBytecode {
    public int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Q37_InspectBytecode obj = new Q37_InspectBytecode();
        System.out.println("Sum: " + obj.add(5, 7));
    }
}

// To inspect bytecode:
// 1. Compile: javac Q37_InspectBytecode.java
// 2. Inspect: javap -c Q37_InspectBytecode
