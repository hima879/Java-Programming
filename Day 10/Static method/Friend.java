public class Friend {

    // static variable shared among all instances
    static int numOfFriends;

    // instance variable for each friend's name
    String name;

    // constructor increments the static count each time a Friend object is created
    Friend(String name) {
        this.name = name;
        numOfFriends++;
    }

    // static method to display total number of friends
    static void showFriends() {
        System.out.println("👬 You have " + numOfFriends + " total friends");
    }
}
