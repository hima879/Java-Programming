public class VarArgsExample {
    public static void main(String[] args) {
        // Call the add method with 4 numbers
        int result = add(1, 2, 3, 4);
        
        // Print the result of the addition
        System.out.println("Sum: " + result);
    }

    // Method using varargs to accept any number of int arguments
    static int add(int... numbers) {
        int sum = 0;
        // Loop through each number passed and add to sum
        for (int number : numbers) {
            sum += number;
        }
        // Return the total sum
        return sum;
    }
}
