package Leetcode;
import java.util.Arrays;
public class TwoSumTwoPointer {
    public static void main(String[] args){
        int[] arr = {2,7,11,15};
        int target = 13;
        int[] res = twoSum(arr,target);
        System.out.println(Arrays.toString(res));
    }
    static int[] twoSum(int[] arr, int target){
        int left = 0;
        int right = arr.length-1;
        int sum =0;
        while(left<right){
            sum = arr[left]+arr[right];
            if(sum==target){
                return new int[]{left+1, right+1};
            }else if(sum>target){
                right--;
            }else{
                left++;
            }
        }
        return new int[]{-1,-1};
    }

}
