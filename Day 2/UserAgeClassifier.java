import java.util.Scanner;

// Class to demonstrate input validation and age-based classification
public class UserAgeClassifier {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);  // Create Scanner object to take user input

        String name;

        // Prompt user to enter their name
        System.out.print("Enter your name: ");
        name = scanner.nextLine();

        // Check if name is empty
        if (name.isEmpty()) {
            System.out.println("⚠️ You didn't enter your name!");
        } else {
            System.out.println("👋 Hello " + name + "!");
        }

        int age;

        // Prompt user to enter their age
        System.out.print("Enter your age: ");
        age = scanner.nextInt();

        // Age classification using if-else ladder
        if (age >= 65) {
            System.out.println("🧓 You are a senior.");
        } else if (age >= 18) {
            System.out.println("🧑 You are an adult.");
        } else if (age < 0) {
            System.out.println("🚫 You haven't been born yet.");
        } else if (age == 0) {
            System.out.println("👶 You are a baby!");
        } else {
            System.out.println("🧒 You are a child!");
        }

        scanner.close();  // Close the scanner object
    }
}
