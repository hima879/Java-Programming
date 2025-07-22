public class MathClassDemo {
   public static void main(String[] args) {

      // Print constants PI and E
      System.out.println("🔢 Value of PI: " + Math.PI);
      System.out.println("🔢 Value of Euler’s Number (E): " + Math.E);

      // Power function: 2 raised to 10
      double number1 = Math.pow(2, 10); // 2^10 = 1024

      // Absolute value: |-9| = 9
      double number2 = Math.abs(-9);

      // Square root of 9
      double number3 = Math.sqrt(9);

      // Round 2.49 to the nearest integer
      double number4 = Math.round(2.49);

      // Round 2.50 up to the next integer
      double number5 = Math.ceil(2.50);

      // Round 7.99 down to the previous integer
      double number6 = Math.floor(7.99);

      // Minimum between 2 and 10
      double number7 = Math.min(2, 10);

      // Maximum between 11 and 12
      double number8 = Math.max(11, 12);

      // Print all results
      System.out.println("🔺 Power (2^10): " + number1);
      System.out.println("🔻 Absolute value of -9: " + number2);
      System.out.println("📐 Square root of 9: " + number3);
      System.out.println("🔵 Rounded value of 2.49: " + number4);
      System.out.println("🔼 Ceiling of 2.50: " + number5);
      System.out.println("🔽 Floor of 7.99: " + number6);
      System.out.println("📉 Minimum of (2, 10): " + number7);
      System.out.println("📈 Maximum of (11, 12): " + number8);
   }
}
