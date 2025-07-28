public class GroceryMatrix {
    public static void main(String[] args) {
        
        // Step 1: Declare categories as arrays
        String[] fruits     = {"Apple", "Banana", "Orange"};
        String[] vegetables = {"Carrot", "Broccoli", "Spinach"};
        String[] meats      = {"Chicken", "Beef", "Pork"};

        // Step 2: Combine individual arrays into a 2D array (matrix)
        String[][] groceries = { fruits, vegetables, meats };

        // Step 3: Display the original groceries list
        System.out.println("🛒 Original Groceries List:\n");
        for (String[] category : groceries) {
            for (String item : category) {
                System.out.print(item + "   ");
            }
            System.out.println(); // Move to next row
        }

        // Step 4: Update a specific item in the matrix (e.g., Banana → Mango)
        System.out.println("\n🔄 Updating an item: Replacing 'Banana' with 'Mango'...\n");
        groceries[0][1] = "Mango"; // Accessing fruits[1]

        // Step 5: Display the updated groceries list
        System.out.println("✅ Updated Groceries List:\n");
        for (String[] category : groceries) {
            for (String item : category) {
                System.out.print(item + "   ");
            }
            System.out.println(); // Move to next row
        }
    }
}
