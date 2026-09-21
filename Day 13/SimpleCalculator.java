import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {

        // Task 2 — Simple Calculator (Addition, Subtraction, Multiplication, Division)
        // Goal: Take two numbers and an operator from user, perform calculation and display result.
        System.out.println("=== Task 2: Simple Calculator Started ===");

        Scanner scanner = new Scanner(System.in);

        double num1;
        double num2;
        char operation;
        double result;

        // Input first number
        System.out.print("Enter the first number: ");
        num1 = scanner.nextDouble();

        // Input second number
        System.out.print("Enter the second number: ");
        num2 = scanner.nextDouble();

        // Input operation character
        System.out.print("Enter the operation you want to perform (+, -, *, /): ");
        operation = scanner.next().charAt(0);

        // Perform calculation based on operation
        switch (operation) {
            case '+':
                result = num1 + num2;
                System.out.printf("%.2f + %.2f = %.2f%n", num1, num2, result);
                break;
            case '-':
                result = num1 - num2;
                System.out.printf("%.2f - %.2f = %.2f%n", num1, num2, result);
                break;
            case '*':
                result = num1 * num2;
                System.out.printf("%.2f * %.2f = %.2f%n", num1, num2, result);
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Error: Division by zero is not allowed.");
                } else {
                    result = num1 / num2;
                    System.out.printf("%.2f / %.2f = %.2f%n", num1, num2, result);
                }
                break;
            default:
                System.out.println("Invalid operation. Please use +, -, *, or /.");
        }

        scanner.close();

        System.out.println("=== Task 2: Simple Calculator Completed ===");
    }
}
