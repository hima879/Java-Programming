public class BreakContinueDemo {
   public static void main(String[] args) {

      // Demonstrating the difference between break and continue in loops

      System.out.println("Using break statement:");
      for (int i = 0; i <= 10; i++) {
         if (i == 5) {
            // Exit the loop completely when i equals 5
            break;
         }
         System.out.print(i + " ");
      }
      System.out.println("\n");

      System.out.println("Using continue statement:");
      for (int j = 0; j <= 10; j++) {
         if (j == 5) {
            // Skip the current iteration when j equals 5
            continue;
         }
         System.out.print(j + " ");
      }
      System.out.println();
   }
}
