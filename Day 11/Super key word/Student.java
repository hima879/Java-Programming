public class Student extends Person {

    double gpa;

    // Constructor uses super() to call parent constructor
    Student(String first, String last, double gpa){
        super(first, last);
        this.gpa = gpa;
    }

    // Method to show GPA
    void showGPA(){
        System.out.println(this.first + "'s GPA is: " + this.gpa);
    }
}
