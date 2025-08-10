import java.util.Scanner;

public class ShoppingReceipt {
    public static void main(String[] args) {

        // Task 4 — Shopping Receipt Generator
        // Goal: Ask the user how many items they are buying,
        //       then input each item's name and price,
        //       finally print a formatted receipt with total cost.
        System.out.println("=== Task 4: Shopping Receipt Generator Started ===");

        Scanner scanner = new Scanner(System.in);

        System.out.print("How many items are you buying? ");
        int count = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        String[] items = new String[count];
        double[] prices = new double[count];

        double total = 0;

        // Input items and prices
        for (int i = 0; i < count; i++) {
            System.out.printf("Enter name of item %d: ", i + 1);
            items[i] = scanner.nextLine();

            System.out.printf("Enter price of %s: $", items[i]);
            prices[i] = scanner.nextDouble();
            scanner.nextLine();  // Consume newline

            total += prices[i];
        }

        // Print receipt
        System.out.println("\n🧾 Your Receipt:");
        System.out.println("----------------------------");
        for (int i = 0; i < count; i++) {
            System.out.printf("%-20s $%.2f%n", items[i], prices[i]);
        }
        System.out.println("----------------------------");
        System.out.printf("TOTAL:              $%.2f%n", total);

        scanner.close();

        System.out.println("=== Task 4: Shopping Receipt Generator Completed ===");
    }
}
