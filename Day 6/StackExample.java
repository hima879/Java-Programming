import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {

        // Create an empty Stack to store String elements (game names)
        Stack<String> stack1 = new Stack<String>();

        // Check if the stack is empty initially (should print true)
        System.out.println("Is the stack empty? " + stack1.empty());

        // Add elements (game names) to the stack using push()
        stack1.push("Minecraft");
        stack1.push("Skyrim");
        stack1.push("DOOM");
        stack1.push("Borderlands");
        stack1.push("FFVII");

        // Print the entire stack to see all elements
        System.out.println("Current stack: " + stack1);

        // Peek at the top element without removing it
        System.out.println("Top element: " + stack1.peek());

        // Search for "Minecraft" in the stack and print its position
        // Note: Positions start from 1 at the top of the stack
        System.out.println("Position of 'Minecraft' in stack: " + stack1.search("Minecraft"));

        // Check again if the stack is empty (should print false now)
        System.out.println("Is the stack empty? " + stack1.empty());

        // Remove the top two elements using pop()
        stack1.pop(); // removes "FFVII"
        stack1.pop(); // removes "Borderlands"
        System.out.println("Stack after popping two elements: " + stack1);

        // Remove next two elements
        stack1.pop(); // removes "DOOM"
        stack1.pop(); // removes "Skyrim"

        // Pop the last remaining element and store it
        String myFavoriteGame = stack1.pop(); // removes "Minecraft"

        // Now stack should be empty
        System.out.println("Is the stack empty now? " + stack1.empty());

        // Print the last removed element
        System.out.println("My favorite game was: " + myFavoriteGame);
    }
}
