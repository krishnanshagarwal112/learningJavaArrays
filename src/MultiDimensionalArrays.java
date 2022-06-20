import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensionalArrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*
        Example of array
                1 2 3
                4 5 6
                7 8 9
         */
//      int[][] arr = new int[3][]; // int[rows][columns]
//        int[][] arr = {
//                {1, 2, 3},
//                {4, 5, 6},
//                {7, 8, 9}       // individual size of rows can vary
//        };
        int[][] arr = new int[3][3];
        // input a 2d array
        for( int row = 0; row < arr.length; row++){
            // for each col in each roq
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
            }
        }

        //output
        for( int row = 0; row < arr.length; row++){
            // for each col in each roq
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println("");

        }
        //output in another way
        for( int row = 0; row < arr.length; row++){
            System.out.println(Arrays.toString(arr[row]));
        }
    }
}
