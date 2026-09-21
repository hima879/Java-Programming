package Leetcode;

public class SubArrayMaxSum {
    public static void main(String[] args){
        int[] arr = {-2,1,-3,4};
        int res = sum(arr);
        System.out.println(res);
    }
    public static int sum(int[] nums){
        int currentSum = 0;
        int maxSum = nums[0];
        for(int i =0;i<nums.length;i++){
        currentSum = Math.max(nums[i],currentSum + nums[i]);
        maxSum = Math.max(maxSum,currentSum);
    }
        return maxSum;
    }


}
