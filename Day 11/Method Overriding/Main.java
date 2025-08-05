// Parent class
public class Animal {

    // This method will be inherited by subclasses and can be overridden
    void move() {
        System.out.println("This animal is running");
    }
}

// Subclass Dog inherits Animal
public class Dog extends Animal {
    // No override, so it uses Animal's move() method
}

// Subclass Cat inherits Animal
public class Cat extends Animal {
    // No override, so it uses Animal's move() method
}

// Subclass Fish inherits Animal and overrides move()
public class Fish extends Animal {

    @Override
    void move() {
        // Custom behavior specific to Fish
        System.out.println("This animal is swimming");
    }
}

// Main class to test the behavior
public class Main {
    public static void main(String[] args) {

        // Method Overriding = Subclass provides a specific implementation 
        //                     of a method already defined in the superclass.
        //                     Enables code reusability and customization.

        Dog dog = new Dog();     // Dog uses Animal's move()
        Cat cat = new Cat();     // Cat uses Animal's move()
        Fish fish = new Fish();  // Fish uses its own move()

        System.out.println("Dog's movement:");
        dog.move(); // Output: This animal is running

        System.out.println("Cat's movement:");
        cat.move(); // Output: This animal is running

        System.out.println("Fish's movement:");
        fish.move(); // Output: This animal is swimming
    }
}
