import java.util.Scanner;

// 📘 Program to demonstrate ternary operator usage in Java

public class TernaryOperatorDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double score;   // 🧪 User's score input

        // 🎯 Check pass or fail using ternary operator
        System.out.print("📥 Enter your score: ");
        score = scanner.nextDouble();

        String result = (score >= 60) ? "✅ PASS" : "❌ FAIL";
        System.out.println("🎓 Result: " + result);

        int number;  // 🔢 Number to check for even/odd

        // 🎯 Check even or odd using ternary operator
        System.out.print("📥 Enter a number: ");
        number = scanner.nextInt();

        String evenOrOdd = (number % 2 == 0) ? "🟢 EVEN" : "🟠 ODD";
        System.out.println("📊 Number Type: " + evenOrOdd);

        scanner.close();  // 🛑 Close scanner
    }
}
