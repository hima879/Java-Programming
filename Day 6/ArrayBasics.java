import java.util.Arrays;

public class ArrayBasics {
    public static void main(String[] args) {

        // Creating and initializing an array of fruits
        String[] fruits = {"apple", "coconut", "banana", "mango"};

        // Modifying the first element of the array
        fruits[0] = "pineapple"; // replaces "apple" with "pineapple"

        // Getting the total number of fruits in the array
        int numOfFruits = fruits.length;
        System.out.println("Total fruits in the array: " + numOfFruits);

        // Accessing a specific element from the array
        System.out.println("Fruit at index 3: " + fruits[3]);

        // Sorting the array in alphabetical order
        Arrays.sort(fruits);

        // NOTE: Uncomment the line below to replace all elements with "pineapple"
        // Arrays.fill(fruits, "pineapple");

        // Printing all fruits using a standard for loop
        System.out.println("\nFruits after sorting (using standard for loop):");
        for (int i = 0; i < fruits.length; i++) {
            System.out.println("Index " + i + ": " + fruits[i]);
        }

        // Printing all fruits using an enhanced for-each loop
        System.out.println("\nFruits (using enhanced for-each loop):");
        for (String fruit : fruits) {
            System.out.println("Fruit: " + fruit);
        }
    }
}
