import java.util.Scanner;

// Program demonstrating a while loop that continues until user quits
public class GameQuitExample {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String response = "";

        // Loop continues until user enters 'Q' (case-insensitive)
        while (!response.equals("Q")) {
            System.out.println("You are currently in the game.");
            System.out.print("Press 'Q' to quit: ");
            response = scanner.nextLine().toUpperCase();
        }

        System.out.println("You have exited the game. Thanks for playing!");

        scanner.close();
    }
}
