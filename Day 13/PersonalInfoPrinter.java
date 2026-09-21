import java.util.Scanner;

public class PersonalInfoPrinter {
    public static void main(String[] args) {

        // Task 1 — Personal Info Printer (variables, user input, printf)
        // Goal: Ask the user for their name, college, and favorite hobby, 
        // then print them in a neat, formatted way.
        System.out.println("=== Task 1: Personal Info Printer Started ===");

        Scanner scanner = new Scanner(System.in);

        // Input variables declaration
        String name;
        String college;
        String favoriteHobby;

        // Getting user input for name
        System.out.print("Enter your name: ");
        name = scanner.nextLine().trim();

        // Getting user input for college name
        System.out.print("Enter your college name: ");
        college = scanner.nextLine().trim();

        // Getting user input for favorite hobby
        System.out.print("What's your hobby: ");
        favoriteHobby = scanner.nextLine().trim();

        // Output formatted user info
        System.out.printf("Hello %s, nice to meet you!%n", name);
        System.out.printf("You study in %s%n", college);
        System.out.printf("Your favorite hobby is: %s%n", favoriteHobby);

        // Closing the scanner to avoid resource leak
        scanner.close();

        System.out.println("=== Task 1: Personal Info Printer Completed ===");
    }
}
