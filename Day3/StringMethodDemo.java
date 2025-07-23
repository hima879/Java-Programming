// Program to demonstrate various string methods and number formatting in Java

public class StringMethodDemo {
    public static void main(String[] args) {
        
        // Initializing string variables
        String name = "Penelope Eckart";
        String name2 = "REYNOLD ECKART";
        String name3 = "     Callisto Regulus    ";
        String name4 = "Berry";

        // Applying various String methods
        int length = name.length();              // Returns the length of 'name'
        char letter = name.charAt(7);            // Character at index 7
        int index = name.indexOf("e");           // First index of 'e'
        int lastIndex = name.lastIndexOf("e");   // Last index of 'e'

        name = name.toUpperCase();               // Converts name to uppercase
        name2 = name2.toLowerCase();             // Converts name2 to lowercase
        name3 = name3.trim();                    // Removes leading and trailing whitespaces
        name4 = name4.replace("e", "/");         // Replaces all occurrences of 'e' with '/'

        // Printing results of string operations
        System.out.println("Length of original name: " + length);
        System.out.println("Character at index 7: " + letter);
        System.out.println("First index of 'e': " + index);
        System.out.println("Last index of 'e': " + lastIndex);
        System.out.println("Name in uppercase: " + name);
        System.out.println("Name2 in lowercase: " + name2);
        System.out.println("Trimmed name3: '" + name3 + "'");
        System.out.println("Modified name4: " + name4);

        // Checking if the string is empty
        System.out.println("Is name empty? " + name.isEmpty());

        if (name.isEmpty()) {
            System.out.println("Your name is empty.");
        } else {
            System.out.println("Hello " + name);
        }

        // Checking for whitespace
        if (name.contains(" ")) {
            System.out.println("Yes, there is whitespace in your name.");
        } else {
            System.out.println("Your name doesn't contain any whitespace.");
        }

        // Checking if name equals "password"
        if (name.equals("password")) {
            System.out.println("Your name can't be 'password'.");
        } else {
            System.out.println("Hello again, " + name);
        }
    }
}
