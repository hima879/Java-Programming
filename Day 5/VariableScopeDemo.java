// Program to demonstrate Variable Scope in Java
public class VariableScopeDemo {

   // Class-level static variable (global to all methods in the class)
   static int x = 3;

   public static void main(String[] args) throws InterruptedException {
      
      // Local variable declared in the main method
      int x = 1;
      System.out.println("main-local x = " + x); // Outputs 1

      // Calling a method that has its own local variable with same name
      doSomething();

      // Accessing class-level (global) variable using class name
      System.out.println("class-static x = " + VariableScopeDemo.x); // Outputs 3
   }

   // Method demonstrating another local variable with the same name
   static void doSomething(){
      int x = 2; // Local to doSomething method
      System.out.println("doSomething-local x = " + x); // Outputs 2
   }
}
