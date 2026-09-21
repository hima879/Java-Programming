import java.util.Scanner;

public class BasicBankingSystem {
    // Scanner to take input from user
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Initial balance set to zero
        double balance = 0;

        // Boolean flag to keep program running
        boolean isRunning = true;

        while (isRunning) {
            // Display menu options
            System.out.println("\n===================");
            System.out.println("WELCOME TO BASIC BANK");
            System.out.println("===================");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Choose an option (1-4): ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> checkBalance(balance);
                case 2 -> balance += depositAmount();
                case 3 -> balance -= withdrawAmount(balance);
                case 4 -> {
                    isRunning = false;
                    System.out.println("Thank you for banking with us! Have a great day!");
                }
                default -> System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }
        }
        scanner.close();
    }

    // Method to display current balance
    static void checkBalance(double balance) {
        System.out.printf("Your current balance is: $%.2f%n", balance);
    }

    // Method to deposit money; returns the deposited amount or 0 if invalid
    static double depositAmount() {
        System.out.print("Enter deposit amount: ");
        double amount = scanner.nextDouble();

        if (amount <= 0) {
            System.out.println("Deposit amount must be positive.");
            return 0;
        }
        return amount;
    }

    // Method to withdraw money; returns the withdrawn amount or 0 if invalid or insufficient funds
    static double withdrawAmount(double balance) {
        System.out.print("Enter withdrawal amount: ");
        double amount = scanner.nextDouble();

        if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
            return 0;
        } else if (amount > balance) {
            System.out.println("Insufficient funds.");
            return 0;
        }
        return amount;
    }
}
