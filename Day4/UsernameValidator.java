import java.util.Scanner;

public class UsernameValidator {
   public static void main(String[] args) {

      // Logical Operators:
      // && = AND, || = OR, ! = NOT

      Scanner scanner = new Scanner(System.in);

      System.out.print("Enter your username: ");
      String username = scanner.nextLine();

      // Check if username length is between 4 and 12 characters
      if (username.length() < 4 || username.length() > 12) {
         System.out.println("Username must be between 4-12 characters.");
      }
      // Check if username contains whitespace or underscore
      else if (username.contains(" ") || username.contains("_")) {
         System.out.println("Username must not contain any whitespaces or underscores.");
      }
      else {
         System.out.println("WELCOME " + username + "!");
      }

      scanner.close();
   }
}
