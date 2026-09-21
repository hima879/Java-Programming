package ARRAY;
import java.util.Scanner;
public class Array_Objects {
        public static void  main(String[] args){
            try (Scanner sc = new Scanner(System.in)) {

                String[] str = new String[5];
                for (int i = 0; i<str.length; i++){
                    System.out.print("Enter the object names: ");
                    str[i] = sc.nextLine();
                }
                for (String s : str) {
                    System.out.println(s);
                }

                //modify array
                str[1]= "Guava";
                System.out.println(str[1]);
            }
        }
}
