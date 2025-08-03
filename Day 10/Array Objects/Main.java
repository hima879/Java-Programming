// Main.java
public class Main {
    public static void main(String[] args) {

        // 🔧 Creating car objects using the Car class
        Car car1 = new Car("Mustang", "Red");
        Car car2 = new Car("Corvette", "Blue");
        Car car3 = new Car("Charger", "Yellow");

        // 🚘 Storing car objects in an array
        Car[] cars = {car1, car2, car3};

        // 🔄 Using normal for loop to call the drive method
        System.out.println("🚦 Driving using normal for loop:");
        for (int i = 0; i < cars.length; i++) {
            cars[i].drive();
        }

        System.out.println();

        // 🔁 Using enhanced for loop (for-each) to do the same
        System.out.println("🚦 Driving using enhanced for loop:");
        for (Car car : cars) {
            car.drive();
        }
    }
}
