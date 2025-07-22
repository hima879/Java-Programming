// Class to demonstrate the use of assignment operators in Java
public class AssignmentOperators {

    public static void main(String[] args) {

        // Initializing five integer variables
        int num1 = 5;
        int num2 = 10;
        int num3 = 15;
        int num4 = 20;
        int num5 = 25;

        // Using assignment operators to modify values
        num1 += 2; // num1 = num1 + 2 => 5 + 2 = 7
        num2 -= 3; // num2 = num2 - 3 => 10 - 3 = 7
        num3 *= 2; // num3 = num3 * 2 => 15 * 2 = 30
        num4 /= 2; // num4 = num4 / 2 => 20 / 2 = 10
        num5 %= 4; // num5 = num5 % 4 => 25 % 4 = 1

        // Printing the updated values
        System.out.println("Updated value of num1 (+=): " + num1);
        System.out.println("Updated value of num2 (-=): " + num2);
        System.out.println("Updated value of num3 (*=): " + num3);
        System.out.println("Updated value of num4 (/=): " + num4);
        System.out.println("Updated value of num5 (%=): " + num5);
    }
}
