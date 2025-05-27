// Q39: Reflection in Java
// Objective: Use Java Reflection API.
// Task: Load a class and invoke methods dynamically.
// Instructions:
// - Use Class.forName(), getDeclaredMethods(), and invoke() to call a method without
//   directly referencing it in code.
// - Print the method names and parameters.

import java.lang.reflect.Method;

public class Q39_ReflectionInJava {
    public void hello(String name) {
        System.out.println("Hello, " + name);
    }

    public static void main(String[] args) throws Exception {
        Class<?> clazz = Class.forName("Q39_ReflectionInJava");
        Object obj = clazz.getDeclaredConstructor().newInstance();

        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println("Method: " + method.getName());
        }

        Method helloMethod = clazz.getDeclaredMethod("hello", String.class);
        helloMethod.invoke(obj, "Reflection");
    }
}
