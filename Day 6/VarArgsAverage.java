public class VarArgsAverage {
    public static void main(String[] args) {

        // Call avg with 4 numbers and print the average
        double result = avg(22, 33, 44, 55);
        System.out.println("Average: " + result);

        // Call avg with no arguments to check behavior when no numbers are provided
        System.out.println("Average with no numbers: " + avg());
    }

    // Method to calculate average of any number of double values using varargs
    static double avg(double... numbers) {
        double sum = 0;

        // If no numbers are passed, return 0 to avoid division by zero
        if (numbers.length == 0) {
            return 0;
        }

        // Loop through each number to calculate the sum
        for (double number : numbers) {
            sum += number;
        }

        // Calculate average by dividing sum by count of numbers
        return sum / numbers.length;
    }
}
