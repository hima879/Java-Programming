/*
    Program: Birthday Message Generator
    Concept: Methods (Function Calls), String Formatting, and Reusability in Java
*/

public class BirthdayMessage {

    public static void main(String[] args) throws InterruptedException {
        // Declaring a name and age to pass to the method
        String name = "Himanshi";
        int age = 18;

        // Calling the method twice to print the birthday message two times
        displayBirthdayMessage(name, age);
        displayBirthdayMessage(name, age);
    }

    // This method prints a formatted birthday message using the provided name and age
    static void displayBirthdayMessage(String name, int age){
        System.out.println("🎉 Happy Birthday to you!");
        System.out.printf("🎂 Happy Birthday dear %s!\n", name); // Uses %s to insert the name
        System.out.printf("🎈 You are now %d years old!\n", age); // Uses %d to insert the age
        System.out.println("🎉 Happy Birthday to you!\n");
    }
}
