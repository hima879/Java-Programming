public class Student {

    // Fields (Attributes) of the Student class
    String name;
    int age;
    double gpa;
    boolean isEnrolled;

    // 👇 Constructor to initialize the student object
    Student(String name, int age, double gpa) {
        this.name = name;           // 'this' refers to the current object
        this.age = age;
        this.gpa = gpa;
        this.isEnrolled = true;     // All students are enrolled by default
    }

    // 📚 Method to simulate studying behavior
    void study() {
        System.out.println(name + " is currently studying 📖");
    }
}
