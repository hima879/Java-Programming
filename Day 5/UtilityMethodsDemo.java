/*
    Program: Utility Methods Demonstration
    Concept: Custom Methods with Different Return Types in Java
    Includes: Square, Cube, Full Name Combination, and Age Check
*/

public class UtilityMethodsDemo {

    public static void main(String[] args) throws InterruptedException {

        // 🟢 Example 1: Square of a number
        // Input: 6 → Expected Output: 36.0
        // Real-life Use: Used in area calculations (e.g., area of a square)
        double result = square(6);
        System.out.println("📐 The square of 6 is: " + result);

        // 🟢 Example 2: Cube of a number
        // Input: 6 → Expected Output: 216.0
        // Real-life Use: Volume calculations (e.g., cube-shaped boxes)
        System.out.println("📦 The cube of 6 is: " + cube(6));

        // 🟢 Example 3: Combining first and last name
        // Input: "Bro", "Code" → Output: "Bro Code"
        // Real-life Use: Displaying full names in forms, certificates, etc.
        System.out.println("👤 Full name is: " + getFullName("Bro", "Code"));

        // 🟢 Example 4: Checking adulthood based on age
        // Input: 4 → Output: false (not an adult)
        // Real-life Use: Eligibility checks (e.g., for voting or licenses)
        System.out.println("🔍 Is a 4-year-old an adult? " + ageCheck(4));
    }

    // 🔹 Method 1: Calculate square
    // Takes a number as input and returns its square (number × number)
    // Example: square(6) → 36.0
    static double square(double number) {
        return number * number;
    }

    // 🔹 Method 2: Calculate cube
    // Takes a number as input and returns its cube (number × number × number)
    // Example: cube(6) → 216.0
    static double cube(double number) {
        return number * number * number;
    }

    // 🔹 Method 3: Get full name
    // Combines first and last names with a space and returns the full name
    // Example: getFullName("Bro", "Code") → "Bro Code"
    static String getFullName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }

    // 🔹 Method 4: Check age
    // Returns true if the person is 18 or older, false otherwise
    // Example: ageCheck(4) → false
    static boolean ageCheck(int age) {
        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }
}

