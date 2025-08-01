public class OverloadedConstructorDemo {
    public static void main(String[] args) {

        // ✨ Demonstrating Overloaded Constructors ✨
        // A class can have multiple constructors with different parameter lists

        // Creating user with only username
        UserProfile user1 = new UserProfile("Spongebob");
        System.out.println("🧍‍♂️ User 1");
        System.out.println("Name: " + user1.username);
        System.out.println("Email: " + user1.email);
        System.out.println("Age: " + user1.age);

        System.out.println();

        // Creating user with username and email
        UserProfile user2 = new UserProfile("Patrick", "patrick123@gmail.com");
        System.out.println("🧍‍♂️ User 2");
        System.out.println("Name: " + user2.username);
        System.out.println("Email: " + user2.email);
        System.out.println("Age: " + user2.age);

        System.out.println();

        // Creating user with all details
        UserProfile user3 = new UserProfile("Sandy", "sandy123@gmail.com", 25);
        System.out.println("🧍‍♀️ User 3");
        System.out.println("Name: " + user3.username);
        System.out.println("Email: " + user3.email);
        System.out.println("Age: " + user3.age);

        System.out.println();

        // Creating user with no details (default constructor)
        UserProfile user4 = new UserProfile();
        System.out.println("🧍 Guest User");
        System.out.println("Name: " + user4.username);
        System.out.println("Email: " + user4.email);
        System.out.println("Age: " + user4.age);
    }
}
