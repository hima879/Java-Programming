package Leetcode;

public class ContainerWithMostWaterTwoPointers {
    public static void main(String[] args){
        int[]  arr = {1,8,6,2,5,4,8,3,7};
        int res = maxArea(arr);
        System.out.println(res);
    }
    public static int maxArea(int[] height){
        int left = 0;
        int maxArea = 0;
        int right = height.length-1;
        while(left<=right) {
            int width = right - left;   //distance between lines
            int minHeight = Math.min(height[left], height[right]);
            int area = minHeight * width; //compute water contained
            maxArea = Math.max(maxArea, area);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }
}
