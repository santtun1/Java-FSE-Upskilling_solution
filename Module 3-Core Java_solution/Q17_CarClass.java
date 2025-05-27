// 17. Class and Object Creation
// Objective: Understand classes and objects.
// Task: Create a Car class with attributes and methods.
// Instructions:
// - Define attributes: make, model, year.
// - Implement a method displayDetails() to print car information.
// - Create objects of the Car class and call the method.

class Car {
    String make;
    String model;
    int year;

    Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    void displayDetails() {
        System.out.println("Make: " + make + ", Model: " + model + ", Year: " + year);
    }
}

public class Q17_CarClass {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Camry", 2020);
        Car car2 = new Car("Honda", "Civic", 2019);
        car1.displayDetails();
        car2.displayDetails();
    }
}
