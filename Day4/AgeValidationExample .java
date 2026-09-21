import java.util.Scanner;
 
// Program demonstrating a while loop to validate age input
public class AgeValidationExample {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int age = 0;

        System.out.print("Please enter your age: ");
        age = scanner.nextInt();

        // Loop to ensure age is not negative
        while (age < 0) {
            System.out.println("Age cannot be negative! Please enter a valid age.");
            System.out.print("Enter your age again: ");
            age = scanner.nextInt();
        }

        System.out.println("You are " + age + " years old.");

        scanner.close();
    }
}
