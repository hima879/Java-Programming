package Leetcode;

public class Binary_Search {
    public static void main(String[] args){
        int[] arr = {20, 17, 15, 13, 11, 9, 7};
        int target = 11;
        int res = search(arr,target);
        if (res != -1) {
            System.out.println("Element found at index: " + res);
        } else {
            System.out.println("Element not found");
        }
    }
    public static int search(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while(start<=end){
            int middle = start + (end-start)/2;

            if(arr[middle] == target) {
                return middle;
            }
            else if(arr[middle]>target){
                start = middle+1;
            }else{
                end = middle-1;
            }
        }
        return -1;
    }
}