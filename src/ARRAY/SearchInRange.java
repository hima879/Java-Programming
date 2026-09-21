package ARRAY;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {18, 12, -7, 3, 14, 28};
        int target = 14;
        int s = 1;
        int e = 5;
        int res = search(arr, target, s, e);
        System.out.println(res);
    }

    static int search(int[] arr, int target, int s, int e) {
        if(arr.length ==0){
            return -1;
        }
        // Loop only within the given index range
        for (int i = s; i <= e; i++) {
            if (target == arr[i]) {
                return i; // return index (better practice)
            }
        }
        return -1;
    }
}
