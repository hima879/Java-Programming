package ARRAY;
import java.util.ArrayList;
import java.util.Scanner;
/*When we don’t know the size of data in advance,
 ArrayList is needed in Java because it is dynamic, unlike arrays.*/
public class Array_list {
    public static void main(String[] args){

        ArrayList<Integer> list = new ArrayList<>(10);
        //can also pass in the data type but it's not necessary
        //ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(67);
        list.add(100);
        list.add(2);
        list.add(44);
        list.add(55);
        list.add(24);
        list.add(72);
        list.add(89);
        list.add(33);
        list.add(34);
        System.out.println(list.contains(24));
        System.out.println(list);
        list.set(0, 99);    //set 99 at index 0
        System.out.println(list);
        list.remove(2);
        System.out.println(list);

        ArrayList<Integer> new_list = new ArrayList<>(10);
        try (Scanner sc = new Scanner(System.in)) {
            for(int i =0; i<5; i++){
                new_list.add(sc.nextInt());
            }
        }
        for(int i =0; i<5; i++){
            System.out.println(new_list.get(i));       //pass index here
        }

    }
}
