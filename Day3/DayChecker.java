import java.util.Scanner;

// 📅 Program to check if a day is a weekday or weekend using enhanced switch

public class DayChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("🗓️ Enter the day: ");
        String day = scanner.nextLine();

        // Enhanced switch statement to check day type
        switch(day) {
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> 
                System.out.println("📌 It is a weekday.");
            case "Saturday", "Sunday" -> 
                System.out.println("🎉 It is a weekend.");
            default -> 
                System.out.println("❌ " + day + " is not a valid day.");
        }

        scanner.close();
    }
}
