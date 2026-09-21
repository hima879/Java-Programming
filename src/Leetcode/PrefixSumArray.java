package Leetcode;

import java.util.Arrays;

public class PrefixSumArray {
    public static void main(String[] args){
        int[] arr = {1,2,3,4};
        int[] res = sum(arr);
        System.out.println(Arrays.toString(res));
    }
    public static int[] sum(int[] arr){
        int[] result = new int[arr.length];
        int currentSum = 0;

        for(int i =0;i<arr.length;i++){
            currentSum = currentSum +arr[i];
            result[i] = currentSum;
        }
        return result;
    }

}
