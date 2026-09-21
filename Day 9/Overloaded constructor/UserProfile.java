public class UserProfile {

    // Fields for user information
    String username;
    String email;
    int age;

    // Default constructor
    UserProfile() {
        this.username = "Guest";
        this.email = "Not provided";
        this.age = 0;
    }

    // Constructor with username only
    UserProfile(String username) {
        this.username = username;
        this.email = "Not provided";
        this.age = 0;
    }

    // Constructor with username and email
    UserProfile(String username, String email) {
        this.username = username;
        this.email = email;
        this.age = 0;
    }

    // Constructor with username, email, and age
    UserProfile(String username, String email, int age) {
        this.username = username;
        this.email = email;
        this.age = age;
    }
}
