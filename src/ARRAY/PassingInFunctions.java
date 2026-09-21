package ARRAY;

/*toString() is a method inherited from the Object class that returns a string representation of an object.
For arrays in Java, toString() does not return the elements of the array,
but instead returns a reference string containing the array’s type and memory hash.
👉 Therefore, to get a readable string of array elements, Java provides:
Arrays.toString() for 1D arrays
Arrays.deepToString() for 2D or multi-dimensional arrays*/

import java.util.Arrays;
public class PassingInFunctions {
        public static void main(String[] args){
            int[] nums = {3,4,5,12};
            System.out.println(Arrays.toString(nums));
            change(nums);
            System.out.println(Arrays.toString(nums));
        }
        //Strings are immutable in java
        //arrays are mutable in java
        static void change(int[] arr){
            arr[0] = 99;
        }

    }


