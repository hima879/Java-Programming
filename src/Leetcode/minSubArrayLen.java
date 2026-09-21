package Leetcode;
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
            int n = nums.length;
            int minLength = Integer.MAX_VALUE; // Step 1: start with a very big length
            int sum = 0;                        // Step 2: current sum of window
            int start = 0;                      // Step 3: left pointer of window

            for (int end = 0; end < n; end++) { // Step 4: right pointer moves through the array
                sum += nums[end];               // Step 5: add current element to sum

                // Step 6: shrink window from the left as long as sum >= target
                while (sum >= target) {
                    minLength = Math.min(minLength, end - start + 1); // Step 6a: update minimum length
                    sum -= nums[start];                               // Step 6b: remove leftmost element
                    start++;                                          // Step 6c: move start to right
                }
            }

            // Step 7: if minLength was updated, return it; else return 0
            return (minLength == Integer.MAX_VALUE) ? 0 : minLength;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {2,3,1,2,4,3};
        int target = 9;
        System.out.println("Minimum length subarray sum ≥ " + target + " is " + sol.minSubArrayLen(target, nums));
    }
}


