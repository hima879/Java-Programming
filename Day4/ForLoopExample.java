import java.util.Scanner;

// Program to demonstrate for loop in Java
public class ForLoopExample {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("How many times should the loop run? Enter a number: ");
        int max = scanner.nextInt();

        // For loop running from 1 to max inclusive
        for (int i = 1; i <= max; i++) {
            System.out.println("Loop iteration: " + i);
        }

        scanner.close();
    }
}
