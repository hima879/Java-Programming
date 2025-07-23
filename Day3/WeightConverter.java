import java.util.Scanner;

// ⚖️ Program to convert weight between lbs (pounds) and kgs (kilograms)

public class WeightConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight;       // 🧮 Input weight
        double new_weight;   // 🔁 Converted weight
        int choice;          // ✅ Option chosen by user

        // 💬 Menu
        System.out.println("⚖️ Weight Conversion Program!");
        System.out.println("1️⃣: Convert lbs to kgs");
        System.out.println("2️⃣: Convert kgs to lbs");

        // 🎯 Get user choice
        System.out.print("👉 Choose an option (1 or 2): ");
        choice = scanner.nextInt();

        // 🔁 Conversion Logic
        if (choice == 1) {
            System.out.print("📥 Enter the weight in lbs: ");
            weight = scanner.nextDouble();
            new_weight = weight * 0.453592;  // 📐 lbs to kgs
            System.out.printf("✅ The weight in kgs is: %.2f kg\n", new_weight);
        } else if (choice == 2) {
            System.out.print("📥 Enter the weight in kgs: ");
            weight = scanner.nextDouble();
            new_weight = weight * 2.20462;   // 📐 kgs to lbs
            System.out.printf("✅ The weight in lbs is: %.2f lbs\n", new_weight);
        } else {
            // ⚠️ Invalid input
            System.out.println("❌ Invalid choice. Please select 1 or 2.");
        }

        scanner.close(); // 🛑 Close input stream
    }
}
