// Program to calculate compound interest using user input
import java.util.Scanner;

public class CompoundInterestCalculator {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      double principal;       // Initial investment amount
      double rate;            // Annual interest rate in decimal
      int timesCompounded;    // Number of times interest is compounded per year
      int years;              // Total number of years
      double amount;          // Final amount after interest

      // 🔢 Taking user input
      System.out.print("💰 Enter the principal amount: ");
      principal = scanner.nextDouble();

      System.out.print("📈 Enter the annual interest rate (in %): ");
      rate = scanner.nextDouble() / 100;  // Convert % to decimal

      System.out.print("🔁 Enter how many times it's compounded per year: ");
      timesCompounded = scanner.nextInt();

      System.out.print("📅 Enter the number of years: ");
      years = scanner.nextInt();

      // 🧮 Formula for compound interest
      amount = principal * Math.pow(1 + rate / timesCompounded, timesCompounded * years);

      // 💡 Display result
      System.out.printf("✅ The amount after %d years is: $%.2f%n", years, amount);

      scanner.close(); // Close scanner to avoid memory leak
   }
}
