// Q38: Decompile a Class File
// Objective: Reverse engineer compiled Java bytecode.
// Task: Use a tool like JD-GUI or CFR to decompile a .class file.
// Instructions:
// - Write a simple Java program and compile it.
// - Open the .class file in a decompiler.
// - Analyze the decompiled source.

public class Q38_DecompileClassFile {
    public void greet() {
        System.out.println("Hello from the decompile example!");
    }

    public static void main(String[] args) {
        Q38_DecompileClassFile example = new Q38_DecompileClassFile();
        example.greet();
    }
}


