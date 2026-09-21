public class MatrixExample {
    public static void main(String[] args) {

        // Creating individual rows for the first 3x3 binary matrix
        int[] num1 = {1, 0, 1};
        int[] num2 = {0, 1, 0};
        int[] num3 = {1, 0, 1};

        // Combining rows into a 2D array (matrix)
        int[][] matrix = {num1, num2, num3};

        // Printing the first binary matrix
        System.out.println("🔹 Displaying Binary Pattern Matrix:");
        for (int[] row : matrix) {
            for (int cell : row) {
                System.out.print(cell + " "); // Print each cell with a space
            }
            System.out.println(); // Move to the next row
        }

        System.out.println(); // Spacer line for output clarity

        // Defining a second 3x3 matrix directly using nested array
        int[][] matrix2 = {
            {2, 3, 4},
            {5, 6, 7},
            {8, 9, 10}
        };

        // Printing the second number matrix
        System.out.println("🔸 Displaying Number Matrix:");
        for (int[] row : matrix2) {
            for (int cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println(); // New line after each row
        }
    }
}

