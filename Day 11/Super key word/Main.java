public class Main {
    public static void main(String[] args) {

        // Creating a Person object
        Person person = new Person("Tom", "Riddle");
        person.showName(); // Output full name

        System.out.println("\n--- Creating a Student object ---");
        Student student = new Student("Harry", "Potter", 8.7);
        student.showName(); // Inherited method from Person
        student.showGPA();  // Student-specific method

        System.out.println("\n--- Creating an Employee object ---");
        Employee employee = new Employee("Rubeus", "Hagrid", 50000);
        employee.showName();  // Inherited method
        employee.showSalary(); // Employee-specific method

        // Directly accessing fields
        System.out.println("\n--- Accessing Fields Directly ---");
        System.out.println("Person: " + person.first + " " + person.last);
        System.out.println("Student GPA: " + student.gpa);
        System.out.println("Employee Salary: $" + employee.salary);
    }
}
