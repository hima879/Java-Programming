import java.util.Scanner;

// 🌡️ Program to demonstrate temperature conversion using ternary operator

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double temp;        // 🔢 Original temperature
        double newTemp;     // 🔁 Converted temperature
        String unit;        // 📏 Desired unit to convert to

        // 🔥 Take user input
        System.out.print("🌡️ Enter the temperature: ");
        temp = scanner.nextDouble();

        System.out.print("📥 Convert to Celsius or Fahrenheit? (C or F): ");
        unit = scanner.next().toUpperCase();  // Convert input to uppercase for consistency

        // 🧪 Use ternary operator for conversion logic
        newTemp = (unit.equals("C")) 
                    ? (temp - 32) * 5 / 9     // Fahrenheit to Celsius
                    : (temp * 9 / 5) + 32;    // Celsius to Fahrenheit

        // 🖨️ Output result with formatting
        System.out.printf("✅ Converted Temperature: %.1f°%s\n", newTemp, unit);

        scanner.close();  // 🛑 Close the scanner
    }
}
