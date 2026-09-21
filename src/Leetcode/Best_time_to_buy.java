package Leetcode;

public class Best_time_to_buy {
    public static void main(String[] args){
    int[] arr = {7, 1, 5, 3, 6, 4};
    int res = maxProfit(arr);
        System.out.println(res);
    }
    public static int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int max = 0;
        for(int price: prices){
            if(price<min){
                min = price;
            }else{
                max = Math.max(max,price-min);
            }
        }
        return max;
    }
}
