import java.util.Scanner;
import java.util.Random;

public class RockPaperScissorsGame {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Possible choices for the game
        String[] choices = {"rock", "paper", "scissors"};

        // Variable to control whether the user wants to play again
        String playAgain = "yes";

        // Game loop — repeats as long as user wants to play
        do {
            System.out.print("Enter your move (rock, paper, scissors): ");
            String playerChoice = scanner.nextLine().trim().toLowerCase();

            // Validate user input
            if (!playerChoice.equals("rock") &&
                !playerChoice.equals("paper") &&
                !playerChoice.equals("scissors")) {
                System.out.println("Invalid choice—please try again.");
                continue; // Go back to start of loop without progressing
            }

            // Computer randomly selects a choice
            String computerChoice = choices[random.nextInt(3)];
            System.out.println("Computer choice: " + computerChoice);

            // Determine the winner
            if (playerChoice.equals(computerChoice)) {
                System.out.println("It's a tie!");
            } else if ((playerChoice.equals("rock") && computerChoice.equals("scissors")) ||
                       (playerChoice.equals("paper") && computerChoice.equals("rock")) ||
                       (playerChoice.equals("scissors") && computerChoice.equals("paper"))) {
                System.out.println("You win!");
            } else {
                System.out.println("Computer wins!");
            }

            // Ask the player if they want to play again
            System.out.print("Play again? (yes/no): ");
            playAgain = scanner.nextLine().trim().toLowerCase();

        } while (playAgain.equals("yes"));

        System.out.println("Thanks for playing!");
        scanner.close();
    }
}
