// Program to demonstrate number formatting in Java
public class NumberFormatDemo {
   public static void main(String[] args) {

      // Floating-point numbers
      double price1 = 9.99;
      double price2 = 100.15;
      double price3 = -54.01;
      double price4 = 9000.99;
      double price5 = 1000000.15;
      double price6 = -5400000.01;

      // Integer values
      int a = 1;
      int b = 33;
      int c = 663;
      int d = 5322;

      // Formatting floating-point numbers
      System.out.printf("🔸 One decimal place: %.1f%n", price1);
      System.out.printf("🔹 Two decimal places: %.2f%n", price2);
      System.out.printf("🔻 Three decimal places (negative): %.3f%n", price3);
      System.out.printf("🟢 Show plus sign: %+.1f%n", price4);
      System.out.printf("💰 Comma separator: %,.2f%n", price5);
      System.out.printf("🔴 Negative value in parentheses: %(.2f%n", price6);
      System.out.printf("🟡 Space before number: % .1f%n", price6);

      // Formatting integers
      System.out.printf("🔢 Leading zeros (4 digits): %04d%n", a);
      System.out.printf("🔢 Leading zeros (4 digits): %04d%n", c);
      System.out.printf("➡️  Right-aligned (width 4): %4d%n", a);
      System.out.printf("➡️  Right-aligned (width 4): %4d%n", c);
