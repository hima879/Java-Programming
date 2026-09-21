// Main class to test all shape implementations
public class Main {
    public static void main(String[] args) {

        // Creating objects of different shapes
        Circle circle = new Circle(5);
        Triangle triangle = new Triangle(3, 6);
        Rectangle rectangle = new Rectangle(6, 4);

        // Displaying details and calculating area
        System.out.println("----- Circle -----");
        circle.display();
        System.out.println("Area of Circle: " + circle.area());

        System.out.println("\n----- Triangle -----");
        triangle.display();
        System.out.println("Area of Triangle: " + triangle.area());

        System.out.println("\n----- Rectangle -----");
        rectangle.display();
        System.out.println("Area of Rectangle: " + rectangle.area());
    }
}
