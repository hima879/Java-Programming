package Leetcode;
//1480
/*Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
Return the running sum of nums.
Example 1:
Input: nums = [1,2,3,4]
Output: [1,3,6,10]
Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].*/
public class runningSumOfArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int[] res = sum(arr);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }
    public static int[] sum(int[] arr) {
        int[] result = new int[arr.length];
        int currentSum = 0;
        for (int i = 0; i < arr.length; i++) {
            currentSum = currentSum + arr[i];
            result[i] = currentSum;
        }
        return result;
    }
}

