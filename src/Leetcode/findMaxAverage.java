package Leetcode;

public class findMaxAverage {
    public static void main(String[] args){
        int[] arr = {1, 4, 2, 10, 23, 3, 1, 0, 20};
        int k = 4;
        System.out.println("Maximum Average sum of subarray size " + k + " is " + calculateMaxAverage(arr, k));
    }
    public static double calculateMaxAverage(int[] arr,int k){
        int n = arr.length;
        int maxSum;
        //Calculate sum of the first window
        int windowSum = 0;
        for(int i =0;i<k;i++){
            windowSum+=arr[i];
        }
        maxSum = windowSum;

        //Slide the window
        for (int i = k;i<n;i++){
            windowSum+= arr[i] - arr[i-k];  //Add next,remove first
            maxSum = Math.max(maxSum,windowSum);
        }
        return (double) maxSum / k;
    }
}
