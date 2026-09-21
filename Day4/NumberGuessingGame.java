import java.util.Random;
import java.util.Scanner;

// Number guessing game demonstrating do-while loop and user input
public class NumberGuessingGame {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int guess;
        int attempts = 0;
        int min = 1;
        int max = 100;

        // Generate random number between min and max (inclusive)
        int randomNumber = random.nextInt(max - min + 1) + min;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.printf("Try to guess a number between %d and %d.\n", min, max);

        // Loop until the user guesses the correct number
        do {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess < randomNumber) {
                System.out.println("Too low! Try again.");
            } else if (guess > randomNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Correct! The number was " + randomNumber + ".");
                System.out.println("You guessed it in " + attempts + " attempts.");
            }
        } while (guess != randomNumber);

        System.out.println("Congratulations on winning the game!");

        scanner.close();
    }
}
