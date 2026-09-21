package ARRAY;
import java.util.Arrays;

class SearchIn2D {
    public static void main(String[] args){
        int[][] arr = {
                {23, 4, 1},
                {18, 12, 3, 9},
                {78, 99, 34, 56},
                {18, 12}
        };

        int target = 34;
        int[] ans = search(arr, target); // returns {row, col}
        System.out.println(Arrays.toString(ans));
        int res = max(arr);
        System.out.println(res);
        System.out.println(Integer.MIN_VALUE);

    }

    static int[] search(int[][] arr, int target){
        for(int r = 0; r < arr.length; r++){
            for(int c = 0; c < arr[r].length; c++){
                if(arr[r][c] == target){
                    return new int[]{r, c};
                }
            }
        }
        return new int[]{-1, -1}; // target not found
    }

    static int max(int[][] arr){
        int max = Integer.MIN_VALUE;
        for (int[] ints: arr){
            for(int Element:ints){
                if(Element>max){
                    max = Element;
                }
            }
        }
        return max;
    }

}
