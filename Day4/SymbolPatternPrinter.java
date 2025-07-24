import java.util.Scanner;

public class SymbolPatternPrinter {
   public static void main(String[] args) throws InterruptedException {

      Scanner scanner = new Scanner(System.in);
      int rows;
      int columns;
      char symbol;

      System.out.print("Enter the number of rows: ");
      rows = scanner.nextInt();

      System.out.print("Enter the number of columns: ");
      columns = scanner.nextInt();

      System.out.print("Enter the symbol to print: ");
      symbol = scanner.next().charAt(0);

      // Nested loops to print the symbol pattern
      for (int i = 1; i <= rows; i++) {
         for (int j = 1; j <= columns; j++) {
            System.out.print(symbol);
         }
         System.out.println();  // Move to next line after each row
      }

      scanner.close();
   }
}
