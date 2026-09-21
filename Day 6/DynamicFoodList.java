import java.util.Scanner;

public class DynamicFoodList {
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

       String[] foods;

       // Ask user how many food items they want to enter
       System.out.print("How many food items do you want to enter? ");
       int size = scanner.nextInt(); // Take the size of the array from user
       foods = new String[size];     // Initialize array with user-defined size

       scanner.nextLine(); // Consume leftover newline after nextInt()

       // Take input for each food item
       for (int i = 0; i < foods.length; i++) {
           System.out.print("Enter the name of a food you like: ");
           foods[i] = scanner.nextLine(); // Read full line input
       }

       // Display all entered food items
       System.out.println("\nYou like these foods:");
       for (String food : foods) {
           System.out.println("- " + food);
       }

       scanner.close(); // Close the Scanner to avoid memory leak
   }
}
