// Abstract class representing a generic Shape
public abstract class Shape {

    // Abstract method - must be implemented by subclasses
    abstract double area();

    // Concrete method - inherited by all subclasses
    void display() {
        System.out.println("This is a shape.");
    }
}
