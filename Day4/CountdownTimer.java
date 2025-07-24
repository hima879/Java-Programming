import java.util.Scanner;

public class CountdownTimer {
   public static void main(String[] args) throws InterruptedException {

      Scanner scanner = new Scanner(System.in);

      System.out.print("Enter the number of seconds to countdown from: ");
      int start = scanner.nextInt();

      // Countdown loop from start down to 0
      for (int i = start; i >= 0; i--) {
         System.out.println("Countdown: " + i);
         Thread.sleep(1000);  // Pause for 1 second between prints
      }

      System.out.println("🎉 Happy New Year!! 🎉");
      scanner.close();
   }
}
