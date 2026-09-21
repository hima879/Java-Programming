public class ConstructorDemo {
    public static void main(String[] args) {

        // 🎯 Constructors are special methods used to initialize new objects.
        // ✅ You can pass arguments to set initial values while creating an object.

        // Creating 3 student objects using the constructor
        Student student1 = new Student("Spongebob", 24, 8.77);
        Student student2 = new Student("Patrick", 22, 8.9);
        Student student3 = new Student("Sandy", 25, 9.0);

        // Displaying the details of student1
        System.out.println("👨‍🎓 Student 1 Details:");
        System.out.println("Name: " + student1.name);
        System.out.println("Age: " + student1.age);
        System.out.println("GPA: " + student1.gpa);
        System.out.println("Enrolled: " + student1.isEnrolled);
        System.out.println();

        // Displaying the details of student2
        System.out.println("👨‍🎓 Student 2 Details:");
        System.out.println("Name: " + student2.name);
        System.out.println("Age: " + student2.age);
        System.out.println("GPA: " + student2.gpa);
        System.out.println("Enrolled: " + student2.isEnrolled);
        System.out.println();

        // Displaying the details of student3
        System.out.println("👩‍🎓 Student 3 Details:");
        System.out.println("Name: " + student3.name);
        System.out.println("Age: " + student3.age);
        System.out.println("GPA: " + student3.gpa);
        System.out.println("Enrolled: " + student3.isEnrolled);
        System.out.println();

        // Calling study method for each student
        student1.study();
        student2.study();
        student3.study();
    }
}
