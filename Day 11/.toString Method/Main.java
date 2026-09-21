// Main class to run the program
public class Main {
    public static void main(String[] args) {

        //.toString() = A method from the Object class
        //              Returns a string representation of an object
        //              If not overridden, it returns the object's memory hash
        //              We override it to make the output more human-readable

        Car car1 = new Car("Ford", "Mustang", 2025, "Red");
        Car car2 = new Car("Chevrolet", "Corvette", 2026, "Blue");

        // Printing car1 and car2 will automatically call the toString() method
        System.out.println("Car 1 details: " + car1);  // Implicitly car1.toString()
        System.out.println("Car 2 details: " + car2);  // Implicitly car2.toString()
    }
}
