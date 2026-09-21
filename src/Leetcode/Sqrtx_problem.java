package Leetcode;

public class Sqrtx_problem {
    public static void main(String[] args) {
        int res = mySqrt(7);
        System.out.println(res);
    }
    public static int mySqrt(int x) {
        if (x == 0 || x == 1) {
            return x;
        }
        int ans = 0;
        int start = 1;
        int end = x;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if ((long) mid * mid == x) {
                return mid;
            }
            else if ((long) mid * mid < x) {
                ans = mid;
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return ans;
    }
}
