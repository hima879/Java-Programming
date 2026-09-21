// Car.java
public class Car {

    // Attributes of the Car class
    String model;
    String color;

    // Constructor to initialize Car objects
    Car(String model, String color) {
        this.model = model;
        this.color = color;
    }

    // Method to simulate driving the car
    void drive() {
        System.out.println("🚗 You drive the " + this.color + " " + this.model);
    }
}
