// Main class to test interfaces and inheritance
public class Main {
    public static void main(String[] args) {

        // Interface helps define shared behavior between unrelated classes

        Rabbit rabbit = new Rabbit();
        Hawk hawk = new Hawk();
        Fish fish = new Fish();

        // Demonstrate behaviors
        System.out.println("Rabbit:");
        rabbit.flee();

        System.out.println("\nHawk:");
        hawk.hunt();

        System.out.println("\nFish:");
        fish.flee();
        fish.hunt();
    }
}
