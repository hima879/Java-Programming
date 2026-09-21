/*
    Program: Square and Cube Calculator
    Concept: Method Creation, Return Types, and Arithmetic Operations in Java
*/

public class PowerCalculator {

    public static void main(String[] args) throws InterruptedException {
        // Calling the method 'square' with the value 6 and storing the result
        double resultSquare = square(6);
        System.out.println("🔢 The square of 6 is: " + resultSquare);

        // Directly printing the result of calling 'cube' with the value 6
        System.out.println("🔢 The cube of 6 is: " + cube(6));
    }

    // This method calculates and returns the square of a number
    static double square(double number){
        return number * number;
    }

    // This method calculates and returns the cube of a number
    static double cube(double number){
        return number * number * number;
    }
}
