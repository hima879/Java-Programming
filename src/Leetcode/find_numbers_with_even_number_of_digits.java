package Leetcode;


//1295
public class find_numbers_with_even_number_of_digits {
    public static void main(String[] args){
    int[] nums = {12,345,2,6,7896};
    int ans = findNumbers(nums);
    System.out.print(ans);
    }
    static int findNumbers(int[] nums){
        int count=0;
        for(int num:nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }
    static boolean even(int num){
        int r = digits(num);
        /*if(r%2==0){
            return true;
          }
          return false;
        */
        return r%2==0;  //shortcut for the same condition
    }

    static int digits(int num){
        if(num<0){
            num = num*-1;       //to make the number positive
        }
        if(num==0){
            return 1;
        }
    int count = 0;
    while(num>0){
        count++;
        num=num/10;     // num /= 10
    }
    return count;
    }
    /*static int digits2(int num){
        if(num<0){
            num=num*-1;
        }

        //Math.log10 (Decimal value from number representation system)
        //faster and efficient way to find the number of digits
        return(int)(Math.log10(num))+1;     //another way to find the number of digits
    }*/

    public static class BinarySearch {
        public static void main(String[] args) {
            int[] arr = {1,3,4,5,7,8,9,10,13,14,16,18};
            int target = 10;
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

            while (start <= end) {
                int middle = start + (end - start) / 2;

                if (arr[middle] == target) {
                    return middle;
                }
                else if (arr[middle] < target) {
                    start = middle + 1;
                }
                else {
                    end = middle - 1;
                }
            }
            return -1;
        }}
}
