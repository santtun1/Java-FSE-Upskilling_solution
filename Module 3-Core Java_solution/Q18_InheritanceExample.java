// 18. Inheritance Example
// Objective: Implement inheritance.
// Task: Create a base class Animal and a subclass Dog.
// Instructions:
// - Animal class should have a method makeSound().
// - Dog class should override makeSound() to print "Bark".
// - Instantiate both classes and call their methods.

class Animal {
    void makeSound() {
        System.out.println("Some generic animal sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Bark");
    }
}

public class Q18_InheritanceExample {
    public static void main(String[] args) {
        Animal genericAnimal = new Animal();
        Dog dog = new Dog();
        genericAnimal.makeSound();
        dog.makeSound();
    }
}
