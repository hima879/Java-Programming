import java.util.Scanner;

// Program demonstrating input validation using a while loop
public class WhileLoopNumberValidation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = 0;

        // Loop continues until user enters a number between 1 and 10 inclusive
        while (number < 1 || number > 10) {
            System.out.print("Please enter a number between 1 and 10: ");
            number = scanner.nextInt();
        }

        System.out.println("Great! You entered: " + number);

        scanner.close();
    }
}
