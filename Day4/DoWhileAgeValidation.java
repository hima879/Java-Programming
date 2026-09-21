import java.util.Scanner;

// Program demonstrating input validation using a do-while loop
public class DoWhileAgeValidation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int age;

        // do-while loop ensures the user inputs a valid (non-negative) age at least once
        do {
            System.out.println("Age cannot be negative!");
            System.out.print("Please enter your age: ");
            age = scanner.nextInt();
        } while (age < 0);

        System.out.println("Thank you! You are " + age + " years old.");

        scanner.close();
    }
}
