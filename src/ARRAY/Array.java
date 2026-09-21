package ARRAY;

public class Array {
    public static void main(String[] args){
       //syntax
       // datatype[] variable_name = new datatype[size]
        // store 5 roll numbers:
        // int[] roll = new int[5]
        // or directly
        // int[] roll = {1,2,3,4,5}

        int[] roll; //declaration of array, roll is getting defined in the stack
        roll = new int[5];  //initialisation: actually here object is being created in the heap memory

        System.out.println(roll[1]); //by default it will show 0

        String[] str = new String[5];
        System.out.println(str[4]); //by default it will show null

        //String str = null(literal)    (can only be assigned to non primitives)
        //int num = null     (cannot be assigned to primitive)
    }

}
