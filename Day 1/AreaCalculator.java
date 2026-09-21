import java.util.Scanner;

public class AreaCalculator {
    public static void main(String[] args) {

        // Step 1: Declare and initialize variables
        double width = 0;   // Declaration + Initialization
        double height = 0;  // Declaration + Initialization
        double area = 0;    // To store the calculated result

        // Step 2: Create Scanner object
        Scanner scanner = new Scanner(System.in);

        // Step 3: Ask user to input width
        System.out.print("Enter the width: ");
        width = scanner.nextDouble();  // Read decimal input for width

        // Step 4: Ask user to input height
        System.out.print("Enter the height: ");
        height = scanner.nextDouble(); // Read decimal input for height

        // Step 5: Calculate area using formula: width × height
        area = width * height;

        // Step 6: Display the result
        System.out.println("The area is: " + area + " cm²");

        // Step 7: Close the scanner
        scanner.close();
    }
}
