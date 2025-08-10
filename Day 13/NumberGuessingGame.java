import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {

        // Task 3 — Number Guessing Game
        // Goal: Generate a random number between 0 and 100 inclusive
        //       and let the user guess it with hints of "Too high" or "Too low".
        System.out.println("=== Number Guessing Game Started ===");

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int attempts = 0;
        int guess;

        int secretNumber = random.nextInt(101);  // 0 to 100 inclusive

        System.out.println("Welcome to the guessing number game!!");

        while (true) {
            System.out.print("Enter your guess (0-100): ");
            guess = scanner.nextInt();
            attempts++;

            if (guess == secretNumber) {
                System.out.println("You guessed the right number!");
                System.out.println("Total attempts: " + attempts);
                break;
            } else if (guess > secretNumber) {
                System.out.println("Too high");
            } else {
                System.out.println("Too low");
            }
        }

        scanner.close();
        System.out.println("=== Number Guessing Game Ended ===");
    }
}
