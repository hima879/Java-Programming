import java.util.Random;
import java.util.Scanner;

public class JavaSlotsGame {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int balance = 100; // Initial balance
        int bet;           // Player's bet amount
        int payout;        // Winnings after a spin
        String[] row;      // Array to hold spin result
        String playAgain;  // Player's choice to continue

        System.out.println("==================================");
        System.out.println("🎰  Welcome to JAVA SLOT MACHINE  🎰");
        System.out.println("   🍇 🍈 🍉 🍊 🍋 - Match 3 to Win!");
        System.out.println("==================================\n");

        while (balance > 0) {
            System.out.println("💰 Your current balance: $" + balance);
            System.out.print("👉 Enter your bet amount: $");
            bet = scanner.nextInt();
            scanner.nextLine(); // Clear the buffer

            // Check for valid bet
            if (bet > balance) {
                System.out.println("⚠️ Insufficient funds. Please bet an amount within your balance.\n");
                continue;
            } else if (bet <= 0) {
                System.out.println("⚠️ Invalid bet. Bet must be greater than $0.\n");
                continue;
            }

            // Deduct the bet from balance
            balance -= bet;

            System.out.println("\n🎲 Spinning the slots...\n");
            row = spinRow(); // Perform the spin
            printRow(row);   // Display the spin result

            payout = getPayout(row, bet); // Calculate winnings

            // Show result to player
            if (payout > 0) {
                System.out.println("🎉 Congratulations! You won $" + payout + "!\n");
                balance += payout; // Add winnings
            } else {
                System.out.println("😢 Sorry! No match this time. Better luck next spin!\n");
            }

            // Ask if player wants to play again
            System.out.print("🔁 Do you want to spin again? (Y/N): ");
            playAgain = scanner.nextLine().toUpperCase();

            if (!playAgain.equals("Y")) {
                break;
            }

            System.out.println("\n=========================");
            System.out.println("🎮 Starting new round...");
            System.out.println("=========================\n");
        }

        // Game end
        System.out.println("\n🛑 GAME OVER!");
        System.out.println("🏁 Final Balance: $" + balance);
        System.out.println("🙏 Thank you for playing JAVA Slots!\n");

        scanner.close();
    }

    // This function randomly generates 3 symbols from the array
    static String[] spinRow() {
        String[] symbols = {"🍇", "🍈", "🍉", "🍊", "🍋"};
        String[] row = new String[3];
        Random random = new Random();

        for (int i = 0; i < 3; i++) {
            row[i] = symbols[random.nextInt(symbols.length)];
        }
        return row;
    }

    // This function prints the slot row
    static void printRow(String[] row) {
        System.out.println("*************************");
        System.out.println("🎰 Result: " + String.join(" | ", row));
        System.out.println("*************************");
    }

    // This function calculates payout based on symbol matches
    static int getPayout(String[] row, int bet) {
        // If all 3 symbols match
        if (row[0].equals(row[1]) && row[1].equals(row[2])) {
            return switch (row[0]) {
                case "🍇" -> bet * 3;
                case "🍈" -> bet * 4;
                case "🍉" -> bet * 5;
                case "🍊" -> bet * 10;
                case "🍋" -> bet * 20;
                default -> 0;
            };
        }
        // If first two symbols match
        else if (row[0].equals(row[1])) {
            return switch (row[0]) {
                case "🍇" -> bet * 2;
                case "🍈" -> bet * 3;
                case "🍉" -> bet * 4;
                case "🍊" -> bet * 5;
                case "🍋" -> bet * 10;
                default -> 0;
            };
        }
        // If last two symbols match
        else if (row[1].equals(row[2])) {
            return switch (row[1]) {
                case "🍇" -> bet * 2;
                case "🍈" -> bet * 3;
                case "🍉" -> bet * 4;
                case "🍊" -> bet * 5;
                case "🍋" -> bet * 10;
                default -> 0;
            };
        }

        // No matches
        return 0;
    }
}
