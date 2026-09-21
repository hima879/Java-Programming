public class Main extends Car {
    public static void main(String[] args) {

        // Since Main extends Car, it inherits all properties and methods from Car

        Main car = new Main(); // Creating an object of Main, which "is-a" Car

        // Displaying inherited attributes
        System.out.println("🚗 Make: " + car.make);
        System.out.println("🚘 Model: " + car.model);
        System.out.println("📅 Year: " + car.year);
        System.out.println("💰 Price: $" + car.price);
        System.out.println("🟢 Is Running? " + car.isRunning);

        // Using inherited methods
        System.out.println("\n🔑 Starting the car...");
        car.start();
        System.out.println("🟢 Is Running? " + car.isRunning);

        System.out.println("\n🛑 Stopping the car...");
        car.stop();
        System.out.println("🟢 Is Running? " + car.isRunning);

        System.out.println("\n🚦 Trying to drive the car...");
        car.drive();

        System.out.println("🛑 Applying brakes...");
        car.brake();
    }
}
