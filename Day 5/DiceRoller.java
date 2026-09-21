import java.util.Scanner;
import java.util.Random;

public class DiceRoller {

    public static void main(String[] args) throws InterruptedException {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numOfDice; // Number of dice user wants to roll
        int total = 0; // Sum of all dice rolls

        // Prompt the user for the number of dice to roll
        System.out.print("Enter the number of Dice to roll: ");
        numOfDice = scanner.nextInt();

        if (numOfDice > 0) {
            // Loop for each die to be rolled
            for (int i = 0; i < numOfDice; i++) {
                // Generate a random number between 1 and 6 (inclusive)
                int roll = random.nextInt(1, 7);

                // Print the ASCII art of the die face
                printDie(roll);

                // Display the value rolled
                System.out.println("You Rolled " + roll);

                // Add the roll value to total sum
                total += roll;
            }

            // After all dice rolled, show total
            System.out.println("Total : " + total);

        } else {
            // Handle invalid input for number of dice
            System.out.println("Number of dice must be greater than 0.");
        }

        scanner.close(); // Close scanner resource
    }

    // Method to print ASCII art representing each die face
    static void printDie(int roll) {
        String dice1 = """
               ---------
              |         |
              |    ●    |
              |         |
               ---------
              """;

        String dice2 = """
               ---------
              | ●       |
              |         |
              |       ● |
               ---------
              """;

        String dice3 = """
               ---------
              | ●       |
              |    ●    |
              |       ● |
               ---------
              """;

        String dice4 = """
               ---------
              | ●     ● |
              |         |
              | ●     ● |
               ---------
              """;

        String dice5 = """
               ---------
              | ●     ● |
              |    ●    |
              | ●     ● |
               ---------
              """;

        String dice6 = """
               ---------
              |  ●   ●  |
              |  ●   ●  |
              |  ●   ●  |
               ---------
              """;

        // Select correct ASCII art based on roll value
        switch (roll) {
            case 1 -> System.out.println(dice1);
            case 2 -> System.out.println(dice2);
            case 3 -> System.out.println(dice3);
            case 4 -> System.out.println(dice4);
            case 5 -> System.out.println(dice5);
            case 6 -> System.out.println(dice6);
            default -> System.out.println("Invalid roll");
        }
    }
}
