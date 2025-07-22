// Class to demonstrate operator precedence in Java
public class OrderOfOperations {

    public static void main(String[] args) {

        // According to PEMDAS: Parentheses, Exponents, Multiplication/Division, Addition/Subtraction
        double result1 = 3 + 4 * 2 / 2.0; // 4 * 2 = 8, 8 / 2.0 = 4.0, 3 + 4.0 = 7.0
        double result2 = 100 / 10 * 9 * (3.5 - 2.5) + 4; // (100/10)=10, 10*9=90, (3.5-2.5)=1.0, 90*1.0=90.0, 90.0+4=94.0

        // Printing the results with descriptions
        System.out.println("Result 1 (3 + 4 * 2 / 2.0): " + result1);
        System.out.println("Result 2 (complex expression with parentheses): " + result2);
    }
}
