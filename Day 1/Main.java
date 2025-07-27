// Program 9: A Mad Libs-style word game using user input and string concatenation
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {

        // Step 1: Create Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Step 2: Declare variables (only declared here, initialized later)
        String adjective1;
        String noun1;
        String adjective2;
        String verb1;
        String adjective3;

        // Step 3: Get user inputs
        System.out.print("Enter an adjective (description): ");
        adjective1 = scanner.nextLine();  // e.g., "funny"

        System.out.print("Enter a noun (animal or person): ");
        noun1 = scanner.nextLine();  // e.g., "monkey"

        System.out.print("Enter an adjective (description): ");
        adjective2 = scanner.nextLine();  // e.g., "noisy"

        System.out.print("Enter a verb ending with -ing (action): ");
        verb1 = scanner.nextLine();  // e.g., "dancing"

        System.out.print("Enter an adjective (description): ");
        adjective3 = scanner.nextLine();  // e.g., "amazed"

        // Step 4: Generate the fun story using concatenation
        System.out.println("\nToday I went to a " + adjective1 + " zoo.");
        System.out.println("In an exhibit, I saw a " + noun1 + ".");
        System.out.println("The " + noun1 + " was " + adjective2 + " and " + verb1 + "!");
        System.out.println("I was " + adjective3 + "!");

        // Step 5: Close scanner to avoid memory leaks
        scanner.close();
    }
}
