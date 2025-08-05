public class Person {
    String first;
    String last;

    // Constructor to initialize name
    Person(String first, String last){
        this.first = first;
        this.last = last;
    }

    // Method to display the full name
    void showName(){
        System.out.println("Full Name: " + this.first + " " + this.last);
    }
}
