package Leetcode;

public class RichestCustomerWealth {
    public static void main(String[] args){

        int[][] arr = {{1,5},{7,3},{3,5}};
        int res = maximumWealth(arr);
        System.out.println(res);
    }
    public static int maximumWealth(int[][] accounts) {
        // person = row
        // account = col
        int max = Integer.MIN_VALUE;
        for (int person=0; person<accounts.length; person++){
            //when you start a new col, take a new sum for that row
            int sum = 0;
            for(int account = 0;account<accounts[person].length;account++){
                sum+=accounts[person][account];
            }
            if (sum>max){
                max = sum;
            }
        }
        return max;
    }
}
