package Leetcode;

public class ConcatenationOfArray {
        public static void main(String[] args) {
            int[] arr = {1, 2, 3, 4};
            int[] res = sum(arr);
            for (int i = 0; i < res.length; i++) {
                System.out.print(res[i] + " ");
            }
        }
        public static int[] sum(int[] arr) {
            int n = arr.length;
            int[] ans = new int[2 * n];
            for (int i = 0; i < n; i++) {
                ans[i] = arr[i];
                ans[i + n] = arr[i];
            }
            return ans;
        }
    }

