// Class to demonstrate basic arithmetic operations in Java
public class ArithmeticOperators {

    public static void main(String[] args) {

        // Declaring and initializing variables
        int num1 = 5;
        int num2 = 10;
        int num3 = 15;

        // Performing arithmetic operations
        int sum = num1 + num2 + num3;           // Addition of three numbers
        int sub = (num3 - num1) - num2;         // Subtraction: (15 - 5) - 10 = 0
        int mul = num1 * num2;                  // Multiplication: 5 * 10 = 50
        int div = num3 / num2;                  // Integer Division: 15 / 10 = 1
        int mod = num3 % num1;                  // Modulus: 15 % 5 = 0

        // Printing the results with explanation
        System.out.println("Sum of all numbers: " + sum);
        System.out.println("Subtraction result: " + sub);
        System.out.println("Multiplication result: " + mul);
        System.out.println("Division result (num3 / num2): " + div);
        System.out.println("Remainder when num3 is divided by num1: " + mod);
    }
}
