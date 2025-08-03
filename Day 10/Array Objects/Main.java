public class Main {
    public static void main(String[] args) {

        System.out.println("🧪 Program 1: Car objects created separately and stored in array\n");

        // 1️⃣ Creating Car objects separately
        Car car1 = new Car("Mustang", "Red");
        Car car2 = new Car("Corvette", "Blue");
        Car car3 = new Car("Charger", "Yellow");

        // Storing them in an array
        Car[] cars1 = {car1, car2, car3};

        // Using a regular for loop to drive each car
        for (int i = 0; i < cars1.length; i++) {
            cars1[i].drive();
        }

        // Using an enhanced for loop to drive each car
        for (Car car : cars1) {
            car.drive();
        }

        System.out.println("\n🎯 Program 2: Car objects created directly in array and color updated\n");

        // 2️⃣ Creating Car objects directly inside the array
        Car[] cars2 = {
            new Car("Mustang", "Red"),
            new Car("Corvette", "Blue"),
            new Car("Charger", "Yellow")
        };

        // Changing color of all cars to black
        System.out.println("🎨 Changing all car colors to black...");
        for (Car car : cars2) {
            car.color = "Black";
        }

        // Driving the cars after color change
        System.out.println("\n🚘 Driving all cars after updating color:\n");
        for (Car car : cars2) {
            car.drive();
        }
    }
}
