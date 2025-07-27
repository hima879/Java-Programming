public class FoodArrayExample {
   public static void main(String[] args) {

      // Declare a String array with space for 3 elements
      String[] foods = new String[3];

      // Assign values to each index in the array
      foods[0] = "pizza";
      foods[1] = "hamburger";
      foods[2] = "taco";

      // Use enhanced for loop to print each element of the array
      for (String food : foods) {
         System.out.println("I like: " + food);
      }

   }
}
