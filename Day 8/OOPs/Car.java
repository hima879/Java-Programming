public class Car {
    // Attributes
    String make = "Toyota";
    String model = "Camry";
    int year = 2022;
    double price = 30000.00;
    boolean isRunning = false;

    // Methods
    void start() {
        if (!isRunning) {
            isRunning = true;
            System.out.println("✅ The car has started.");
        } else {
            System.out.println("⚠️ Car is already running.");
        }
    }

    void stop() {
        if (isRunning) {
            isRunning = false;
            System.out.println("🛑 The car has been stopped.");
        } else {
            System.out.println("⚠️ Car is already stopped.");
        }
    }

    void drive() {
        if (isRunning) {
            System.out.println("🏁 Driving the car now...");
        } else {
            System.out.println("❌ Start the car before driving.");
        }
    }

    void brake() {
        System.out.println("🛑 Braking applied.");
    }
}
