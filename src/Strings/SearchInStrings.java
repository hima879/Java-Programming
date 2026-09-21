package Strings;
import java.util.Arrays;
public class SearchInStrings {

    public static void main(String[] args){
        // String in which we want to search
        String name = "Johny";
        System.out.println(Arrays.toString(name.toCharArray()));
        // Character to be searched
        char target = 'o';
        // Calling search method and printing result
        System.out.println(search(name, target));
        System.out.println(search2(name,target));
    }

    // Method 1: Search using index-based for loop
    static boolean search(String str, char target){
        // If string is empty, character cannot be found
        if(str.length() == 0){
            return false;
        }
        // Loop through each character of the string
        for (int i = 0; i < str.length(); i++){

            // Compare current character with target
            if(target == str.charAt(i)){
                return true; // character found
            }
        }

        // Character not found after complete traversal
        return false;
    }

    // Method 2: Search using enhanced for-each loop
    static boolean search2(String str, char target){

        // If string is empty, return false
        if(str.length() == 0){
            return false;
        }

        // Convert string to character array and loop through it
        for (char c : str.toCharArray()){

            // Check if current character matches target
            if(c == target){
                return true; // character found
            }
        }

        // Character not found
        return false;
    }
}
