import java.util.Scanner;

public class HypotenuseCalculator {
   public static void main(String[] args) {

      Scanner scanner = new Scanner(System.in); // Create Scanner object to take input

      double a, b, c;

      // Input from the user
      System.out.print("Enter the length of side A: ");
      a = scanner.nextDouble();

      System.out.print("Enter the length of side B: ");
      b = scanner.nextDouble();

      // Calculate the hypotenuse using the Pythagorean theorem
      c = Math.sqrt(a * a + b * b);
      // Alternatively: c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

      // Output the result
      System.out.println("🧮 The length of the hypotenuse (side C) is: " + c);

      scanner.close(); // Close the scanner to avoid resource leaks
   }
}
