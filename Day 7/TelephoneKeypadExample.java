public class TelephoneKeypadExample {
    public static void main(String[] args) {

        // Step 1: Create a 2D array representing a telephone keypad
        char[][] telephone = {
            {'1','2','3'},
            {'4','5','6'},
            {'7','8','9'},
            {'*','0','#'}
        };

        // Step 2: Display the keypad layout
        System.out.println("📞 Telephone Keypad Layout:\n");

        // Step 3: Use nested enhanced for-loops to print each row of the keypad
        for (char[] row : telephone) {
            for (char key : row) {
                System.out.print(key + " ");  // Print each key with space
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
