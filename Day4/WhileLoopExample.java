import java.util.Scanner;

// Program to demonstrate input validation using a while loop
public class WhileLoopExample {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String name = "";

        // Keep asking for the user's name until a non-empty string is entered
        while (name.isEmpty()) {
            System.out.print("Please enter your name (cannot be empty): ");
            name = scanner.nextLine();
        }

        // Greeting the user after valid input
        System.out.println("Hello, " + name + "! Welcome!");

        scanner.close();
    }
}
