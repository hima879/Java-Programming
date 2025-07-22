import java.util.Scanner;

// Class to calculate measurements of a sphere
public class SphereCalculator {
   public static void main(String[] args) {

      Scanner scanner = new Scanner(System.in);

      // Asking the user to enter the radius
      System.out.print("Enter the radius of the sphere in cm: ");
      double radius = scanner.nextDouble();

      // Calculating circumference, area, and volume
      double circumference = 2 * Math.PI * radius;
      double area = Math.PI * Math.pow(radius, 2);
      double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);

      // Displaying the results with proper units and formatting
      System.out.printf("🔵 Circumference: %.1f cm%n", circumference);
      System.out.printf("🟢 Surface Area : %.1f cm\u00B2%n", area);
      System.out.printf("🟣 Volume       : %.1f cm\u00B3%n", volume);

      scanner.close();
   }
}
