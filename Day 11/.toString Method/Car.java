// Car class that overrides the toString() method
public class Car {

    // Attributes of the car
    String make;
    String model;
    int year;
    String color;

    // Constructor to initialize the car object
    Car(String make, String model, int year, String color) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
    }

    // Overriding the toString() method to return a readable description of the object
    @Override
    public String toString() {
        // Instead of returning the default object hash, we return meaningful data
        return this.color + " " + this.year + " " + this.make + " " + this.model;
    }
}
