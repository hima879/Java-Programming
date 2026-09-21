import java.util.Scanner;

public class FruitSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Predefined array of fruits
        String[] fruits = {"apple", "coconut", "banana", "mango"};

        // Ask the user to input a fruit name
        System.out.print("Enter the fruit to be found in the array: ");
        String target = scanner.nextLine().trim().toLowerCase(); // Normalize input

        boolean isFound = false; // Flag to check if the fruit is found

        // Loop through the array to find the fruit
        for (int i = 0; i < fruits.length; i++) {
            if (fruits[i].equalsIgnoreCase(target)) { // Case-insensitive comparison
                System.out.println("✅ Element found at index: " + i);
                isFound = true;
                break;
            }
        }

        // Output if the fruit is not found
        if (!isFound) {
            System.out.println("❌ Element not found in the array");
        }

        scanner.close(); // Close the scanner
    }
}
