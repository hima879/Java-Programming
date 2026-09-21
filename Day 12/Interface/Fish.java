// Fish class extends Prey and implements Predator
public class Fish extends Prey implements Predator {

    @Override
    public void flee() {
        System.out.println("*The fish is swimming away to escape*");
    }

    @Override
    public void hunt() {
        System.out.println("The fish is hunting smaller fish.");
    }
}
