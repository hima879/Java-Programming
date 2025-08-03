// Main class to test the inheritance structure
public class Main {
    public static void main(String[] args) {

        // Creating instances
        Dog dog = new Dog();
        Cat cat = new Cat();
        Plant plant = new Plant();

        // Checking inherited boolean property
        System.out.println("Is dog alive? " + dog.isAlive);
        System.out.println("Is cat alive? " + cat.isAlive);
        System.out.println("Is plant alive? " + plant.isAlive);

        // Calling methods
        dog.eat();
        cat.eat();
        plant.photosynthesis();

        // Accessing individual properties
        System.out.println("Dog has " + dog.lives + " life.");
        System.out.println("Cat has " + cat.lives + " lives.");

        // Speaking behavior
        dog.speak();
        cat.speak();
    }
}
