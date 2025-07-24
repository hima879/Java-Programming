public class NestedLoopsDemo {
   public static void main(String[] args) {

      // Demonstrating nested for loops in Java
      // Outer loop runs 3 times (i from 1 to 3)
      // Inner loop runs 9 times for each iteration of the outer loop

      for (int i = 1; i <= 3; i++) {
         for (int j = 1; j <= 9; j++) {
            System.out.print(i + " ");
         }
         System.out.println("\n");  // New line after each inner loop finishes
      }
   }
}
