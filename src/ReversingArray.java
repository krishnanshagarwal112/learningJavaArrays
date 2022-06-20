import java.util.Arrays;

public class ReversingArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,0,-1};
        System.out.println(Arrays.toString(reverse(arr)));
    }
    static int[] reverse(int[] array){ 
        int n = array.length;
        for (int i = 0; i < n/2  ; i++) {
            swap(array , i,n - 1 - i);
        }
        return array;
        }

    static void swap(int[] array, int index1, int index2 ){
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
    }

