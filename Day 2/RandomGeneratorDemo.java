import java.util.Random;

public class RandomGeneratorDemo {
   public static void main(String[] args) {

      Random random = new Random();  // Create Random object

      // Generate 3 random integers between 1 and 10 (inclusive)
      int number1 = random.nextInt(1, 11);
      int number2 = random.nextInt(1, 11);
      int number3 = random.nextInt(1, 11);

      System.out.println("🎯 Random Integers (1–10):");
      System.out.println(number1);
      System.out.println(number2);
      System.out.println(number3);

      // Generate 3 random doubles between 1.0 and 11.0 (exclusive)
      double number4 = random.nextDouble(1, 11);
      double number5 = random.nextDouble(1, 11);
      double number6 = random.nextDouble(1, 11);

      System.out.println("\n📊 Random Doubles (1.0–10.999...):");
      System.out.println(number4);
      System.out.println(number5);
      System.out.println(number6);

      // Generate a random boolean for coin toss
      boolean isHeads = random.nextBoolean();
      System.out.println("\n🪙 Coin Toss Result:");
      if (isHeads) {
         System.out.println("HEADS!");
      } else {
         System.out.println("TAILS!");
      }
   }
}

