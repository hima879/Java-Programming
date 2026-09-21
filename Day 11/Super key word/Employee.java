public class Employee extends Person {

    int salary;

    // Constructor calls parent constructor with super()
    Employee(String first, String last, int salary){
        super(first, last);
        this.salary = salary;
    }

    // Method to show salary
    void showSalary(){
        System.out.println(this.first + "'s salary is: $" + this.salary);
    }
}
