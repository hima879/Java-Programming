package ARRAY;
import java.util.Arrays;
public class MultiDim {
    public static void main(String[] args) {
        /* To take the input
        int[][] arr = new int[4][];
        for (int r = 0; r<arr.length; r++){
            for(int c = 0; c<arr[r].length; c++){
                System.out.print("Enter the elements: ");
                arr = sc.nextInt();
             }
         }
         */

        //It's not necessary to give the size of column but for row its necessary
        //int[][] arr = new int[3][];

        int[][] arr2d = {
                {1,2,3},
                {4,5},
                {6,7,8,9}
        };


        for (int i = 0; i < arr2d.length; i++) {
            for (int j = 0; j < arr2d[i].length; j++) {
                System.out.print(arr2d[i][j] + " ");
            }
            System.out.println();
        }

        //Using toString to print the array
        for (int row = 0; row< arr2d.length; row++){
            System.out.println(Arrays.toString(arr2d[row]));
        }

        //enhanced for loop
        for(int[] a: arr2d){
            System.out.println(Arrays.toString(a));
        }
    }
}
