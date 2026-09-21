import java.util.Scanner;

// Program demonstrating input validation using a do-while loop
public class DoWhileLoopNumberValidation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number;

        // do-while loop ensures the user is prompted at least once
        // Loop repeats while number is not between 1 and 10 inclusive
        do {
            System.out.print("Please enter a number between 1 and 10: ");
            number = scanner.nextInt();
        } while (number < 1 || number > 10);

        System.out.println("Great! You picked: " + number);

        scanner.close();
    }
}
