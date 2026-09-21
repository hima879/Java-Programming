// Program to demonstrate nested if statements and number formatting in Java

public class TicketDiscountCalculator {
    public static void main(String[] args) {

        // Declare and initialize variables
        boolean isStudent = true;
        boolean isSenior = true;
        double price = 9.99; // Original ticket price

        System.out.println("Welcome to the Movie Ticket Discount Calculator!");

        // Apply discounts based on user type
        if (isStudent) {
            if (isSenior) {
                // Both student and senior
                System.out.println("Eligible for senior discount: 20%");
                System.out.println("Eligible for student discount: 10%");
                price *= 0.7; // Apply 30% total discount
            } else {
                // Student only
                System.out.println("Eligible for student discount: 10%");
                price *= 0.9;
            }
        } else {
            if (isSenior) {
                // Senior only
                System.out.println("Eligible for senior discount: 20%");
                price *= 0.8;
            } else {
                // No discount
                System.out.println("Not eligible for any discounts.");
            }
        }

        // Display the final ticket price formatted to 2 decimal places
        System.out.printf("Final ticket price: $%.2f%n", price);
    }
}
