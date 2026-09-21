// Triangle class that extends Shape and implements area() method
public class Triangle extends Shape {
    double base;
    double height;

    // Constructor
    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    // Overriding abstract method from Shape
    @Override
    double area() {
        return 0.5 * base * height;
    }

    // Overriding display to add specific info
    @Override
    void display() {
        System.out.println("This is a triangle with base: " + base + " and height: " + height);
    }
}
