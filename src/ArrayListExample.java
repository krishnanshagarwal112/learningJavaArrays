import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // syntax
        ArrayList<Integer> list = new ArrayList<>();
//        list.add(45);
//        list.add(4);
//        list.add(451);
//        list.add(4520);
//        list.set(0,1); // setting Oth index to 1
////        System.out.println(list);

        // input
        for (int i = 0; i < 4; i++) {
            list.add(in.nextInt());
        }
        System.out.println(list);

        // get index at i
        for (int i = 0; i < 4; i++) {
            System.out.println(list.get(i)); //list[i] will not work here
         }
    }
}
