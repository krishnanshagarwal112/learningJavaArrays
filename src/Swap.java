import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int[] arr = {3,3,4,2,4,1};
        System.out.println(Arrays.toString(arr));
        swap(arr, 1 ,3);
        System.out.println(Arrays.toString(arr));
        swap(arr, 0 ,arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] array,int index1, int index2){
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
