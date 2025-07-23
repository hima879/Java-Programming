import java.util.Scanner;

// 📧 Program to extract username and domain from an email using String methods

public class EmailStringExtractor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 🔹 Ask user to input an email
        System.out.print("📥 Enter your email address: ");
        String new_email = scanner.nextLine();

        // 🔍 Check if the email contains '@' before extracting
        if (new_email.contains("@")) {
            // ✂️ Extract username and domain using substring and indexOf
            String new_username = new_email.substring(0, new_email.indexOf("@"));
            String new_domain = new_email.substring(new_email.indexOf("@") + 1);

            // ✅ Display the results
            System.out.println("👤 Username: " + new_username);
            System.out.println("🌐 Domain: " + new_domain);
        } else {
            // ❌ Invalid format message
            System.out.println("⚠️ Invalid email! Email must contain '@' symbol.");
        }

        // 🔁 Demo example with hardcoded email
        String email = "BroCode123@gmail.com";

        // ⬇️ Two ways of extracting parts of the email string
        String username1 = email.substring(0, 10);  // Manually set substring
        String domain1 = email.substring(11);

        String username2 = email.substring(0, email.indexOf("@")); // Dynamically extract
        String domain2 = email.substring(email.indexOf("@") + 1);

        // 🔍 Output extracted parts from hardcoded email
        System.out.println("📌 Static Extraction:");
        System.out.println("Username (manual): " + username1);
        System.out.println("Domain (manual): " + domain1);
        System.out.println("Username (indexOf): " + username2);
        System.out.println("Domain (indexOf): " + domain2);

        scanner.close(); // Close scanner to avoid resource leak
    }
}
