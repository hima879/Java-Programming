import java.util.Scanner;

// WeatherConditionChecker.java
// A simple Java program demonstrating logical operators (AND, OR, NOT) to check weather conditions

public class WeatherConditionChecker {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Ask user to enter the temperature
        System.out.print("Enter the current temperature (°C): ");
        double temp = scanner.nextDouble();

        // Ask user to specify if it's sunny or not
        System.out.print("Is it sunny outside? (true/false): ");
        boolean isSunny = scanner.nextBoolean();

        // Using logical operators: && (AND), || (OR), ! (NOT)
        if (temp <= 30 && temp >= 0 && isSunny) {
            System.out.println("✅ The weather is good.");
            System.out.println("☀️ It is sunny outside.");
        } else if (temp <= 30 && temp >= 0 && !isSunny) {
            System.out.println("✅ The weather is good.");
            System.out.println("☁️ It is cloudy outside.");
        } else if (temp >= 30 || temp <= 0) {
            System.out.println("❌ The weather is bad.");
        } else {
            System.out.println("⚠️ Unusual weather conditions.");
        }

        scanner.close();
    }
}
