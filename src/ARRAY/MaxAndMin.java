package ARRAY;

public class MaxAndMin {
    public static void main(String[] args){
        int[] arr = {1,4,23,-9,24,0};
        System.out.println(max(arr));
        System.out.println(min(arr));
        System.out.println(maxRange(arr,2,4));
        System.out.println(minRange(arr,2,4));
    }
     private static int max(int[] arr){
        int m = arr[0];
        for (int i = 1; i < arr.length; i++){
            if (m < arr[i]){
                m = arr[i];
            }
        }
         return m;
     }
    private static int min(int[] arr){
        int m = arr[0];
        for (int i = 1; i < arr.length; i++){
            if (m > arr[i]){
                m = arr[i];
            }
        }
        return m;
    }
    private static int maxRange(int[] arr, int s, int e){
        int m = arr[s];
        for (int i = s; i <= e; i++){
            if (m < arr[i]){
                m = arr[i];
            }
        }
        return m;
    }
    private static int minRange(int[] arr, int s, int e){
        int m = arr[s];
        for (int i = s; i <= e; i++){
            if (m > arr[i]){
                m = arr[i];
            }
        }
        return m;
    }
}
