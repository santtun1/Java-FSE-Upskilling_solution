// 19. Interface Implementation
// Objective: Use interfaces in Java.
// Task: Define an interface Playable with a method play().
// Instructions:
// - Implement the interface in classes Guitar and Piano.
// - Each class should provide its own implementation of play().
// - Instantiate the classes and call the method.

interface Playable {
    void play();
}

class Guitar implements Playable {
    public void play() {
        System.out.println("Playing the guitar.");
    }
}

class Piano implements Playable {
    public void play() {
        System.out.println("Playing the piano.");
    }
}

public class Q19_InterfaceImplementation {
    public static void main(String[] args) {
        Playable guitar = new Guitar();
        Playable piano = new Piano();
        guitar.play();
        piano.play();
    }
}
