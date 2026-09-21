package Leetcode;
import java.util.Stack;

public class MinStack {

    Stack<Integer> stack;
    Stack<Integer> minStack;

    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int val) {

        stack.push(val);

        if (minStack.isEmpty() || val <= minStack.peek()) {
            minStack.push(val);
        }
    }

    public void pop() {

        if (stack.peek().equals(minStack.peek())) {
            minStack.pop();
        }

        stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }

    public static void main(String[] args) {

        MinStack obj = new MinStack();

        obj.push(5);
        obj.push(2);
        obj.push(8);

        System.out.println("Minimum: " + obj.getMin()); // 2

        obj.pop();

        System.out.println("Top: " + obj.top()); // 2
        System.out.println("Minimum: " + obj.getMin()); // 2

        obj.pop();

        System.out.println("Minimum: " + obj.getMin()); // 5
    }
}