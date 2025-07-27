import java.util.Scanner;

public class NumberSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Predefined array of numbers
        int[] numbers = {1, 2, 3, 4, 5, 6};

        // Ask the user for the number to search
        System.out.print("Enter the number to be found in the array: ");
        int target = scanner.nextInt();

        boolean isFound = false; // Flag to track if the number is found

        // Search for the number in the array
        for (int i = 0; i < numbers.length; i++) {
            if (target == numbers[i]) {
                System.out.println("✅ Number found at index: " + i);
                isFound = true;
                break; // Stop searching once the number is found
            }
        }

        // If number is not found
        if (!isFound) {
            System.out.println("❌ Number not found in the array.");
        }

        scanner.close(); // Close the scanner
    }
}
