public class Main {
    public static void main(String[] args) {

        // static = makes a variable or method belong to the class itself,
        // not to any specific object. Used for shared data or utility methods.

        // Creating Friend objects
        Friend friend1 = new Friend("Spongebob");
        Friend friend2 = new Friend("Patrick");
        Friend friend3 = new Friend("Sandy");
        Friend friend4 = new Friend("Larry");
        Friend friend5 = new Friend("Gary");

        // Printing names of each friend
        System.out.println("🎉 Friend List:");
        System.out.println(friend1.name);
        System.out.println(friend2.name);
        System.out.println(friend3.name);
        System.out.println(friend4.name);
        System.out.println(friend5.name);

        // Accessing static variable directly via class
        System.out.println("\n📊 Total Friends (using static variable): " + Friend.numOfFriends);

        // Calling static method to show total friends
        Friend.showFriends();
    }
}
