/*
    Program: Method Overloading - Addition Example
    Concept: Method Overloading in Java
    Description: This program shows how multiple methods with the same name but different parameters can coexist.
    Real-life Analogy: Like a calculator that can handle 2, 3, or 4 numbers when adding.
*/

public class AdditionOverloadDemo {

    public static void main(String[] args) throws InterruptedException {

        // 🟢 Example: Adding 4 numbers
        // Input: 1, 2, 3, 4 → Expected Output: 10.0
        System.out.println("🔢 Sum of 4 numbers (1, 2, 3, 4): " + add(1, 2, 3, 4));

        // 🟢 Example: Adding 3 numbers
        // Input: 5.5, 6.5, 2 → Expected Output: 14.0
        System.out.println("🔢 Sum of 3 numbers (5.5, 6.5, 2): " + add(5.5, 6.5, 2));

        // 🟢 Example: Adding 2 numbers
        // Input: 10, 20 → Expected Output: 30.0
        System.out.println("🔢 Sum of 2 numbers (10, 20): " + add(10, 20));
    }

    // 🔹 Overloaded Method 1: Adds 4 double values
    // Example: add(1, 2, 3, 4) → 10.0
    static double add(double a, double b, double c, double d) {
        return a + b + c + d;
    }

    // 🔹 Overloaded Method 2: Adds 3 double values
    // Example: add(5.5, 6.5, 2) → 14.0
    static double add(double a, double b, double c) {
        return a + b + c;
    }

    // 🔹 Overloaded Method 3: Adds 2 double values
    // Example: add(10, 20) → 30.0
    static double add(double a, double b) {
        return a + b;
    }
}
