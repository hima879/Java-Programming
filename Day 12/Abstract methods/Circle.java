// Circle class that extends Shape and implements area() method
public class Circle extends Shape {
    double radius;

    // Constructor
    Circle(double radius) {
        this.radius = radius;
    }

    // Overriding abstract method from Shape
    @Override
    double area() {
        return Math.PI * radius * radius;
    }

    // Overriding display to add specific info
    @Override
    void display() {
        System.out.println("This is a circle with radius: " + radius);
    }
}
