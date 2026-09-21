package ARRAY;

public class Linear_Search {
    public static void main(String[] args){
    int[] nums = {23,22,43,11,18,26,8,4,9,10,19,30,35};
    int target = 23;
    int ans = linearsearch(nums,target);
    System.out.println(ans);
    int ele =  linearsearch2(nums,target);
    System.out.println(ele);
    }

    //search the target and return the element
    static int linearsearch2(int[]  arr, int target){
        if (arr.length == 0){
            return -1;
        }
        //run a for loop
        for (int element : arr){
            if(element == target){
                return element;
            }
        }
        //this line will execute if none of the return statement above have executed
        //hence the target not found
        return -1;
    }

    //search in the array: return the index if item found
    //otherwise if item is not found return -1
    static int linearsearch(int[]  arr, int target){
        if (arr.length == 0){
            return -1;
        }
        //run a for loop
        for (int index = 0; index < arr.length; index++){
            int element = arr[index];
            if(element == target){
                return index;
            }
        }

        //this line will execute if none of the return statement above have executed
        //hence the target not found
        return -1;
    }
}
