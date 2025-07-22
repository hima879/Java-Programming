import java.util.Scanner;

// 💡 Class name reflects what the program does
public class ShoppingCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // 🧾 Create Scanner to take user input

        // 🛒 Declare variables
        String item;         // Name of the item to buy
        double price;        // Price per unit
        int quantity;        // Number of units
        char currency = '$'; // Currency symbol (USD-style)
        double total;        // Total cost

        // 📦 Input Section
        System.out.print("🛍️ What item would you like to buy? : ");
        item = scanner.nextLine(); // Read item name

        System.out.print("💲 What is the price for each? : ");
        price = scanner.nextDouble(); // Read price

        System.out.print("🔢 How many would you like to buy? : ");
        quantity = scanner.nextInt(); // Read quantity

        // 🧮 Calculation Section
        total = price * quantity; // Calculate total cost

        // 📤 Output Section
        System.out.println("\n🧾 Receipt:");
        System.out.println("You bought " + quantity + " unit(s) of \"" + item + "\".");
        System.out.println("Each costs " + currency + price);
        System.out.println("Total amount to pay: " + currency + total);

        scanner.close(); // Close scanner (good practice)
    }
}
