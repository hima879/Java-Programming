package Leetcode;

public class binaryInsertPosition {
    public static void main(String[] args) {
    int[] nums = {1,3,5,6};
    int target = 2;
    int res = searchInsert(nums,target);
        System.out.println(res);
    }

    public static int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mids = start + (end - start) / 2;
            if (nums[mids] == target) {
                return mids;
            } else if (nums[mids] < target) {
                start = mids + 1;
            } else {
                end = mids - 1;
            }
        }
        return start;
    }
}