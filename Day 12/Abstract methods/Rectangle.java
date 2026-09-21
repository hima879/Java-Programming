// Rectangle class that extends Shape and implements area() method
public class Rectangle extends Shape {
    double length;
    double width;

    // Constructor
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Overriding abstract method from Shape
    @Override
    double area() {
        return length * width;
    }

    // Overriding display to add specific info
    @Override
    void display() {
        System.out.println("This is a rectangle with length: " + length + " and width: " + width);
    }
}
