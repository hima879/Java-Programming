// Program 7: Scanner Input and Conditional Logic
import java.util.Scanner;

public class UserInputExample {
    public static void main(String[] args) {

        // Create a Scanner object to take input
        Scanner scanner = new Scanner(System.in);

        // Input: name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello " + name);

        // Input: age (int)
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        System.out.println("You are " + age + " years old.");

        scanner.nextLine(); // Clear newline left by nextInt()

        // Input: favorite color
        System.out.print("Enter your favorite color: ");
        String color = scanner.nextLine();
        System.out.println("Your favorite color is: " + color);

        // Input: GPA (double)
        System.out.print("Enter your GPA: ");
        double gpa = scanner.nextDouble();
        System.out.println("Your GPA is: " + gpa);

        scanner.nextLine(); // Clear newline left by nextDouble()

        // Input: Are you a student?
        System.out.print("Are you a student? (true/false): ");
        boolean isStudent = scanner.nextBoolean();

        // Decision making using if-else
        if (isStudent) {
            System.out.println("You are enrolled as a Student.");
        } else {
            System.out.println("You are not enrolled.");
        }

        scanner.close();
    }
}
