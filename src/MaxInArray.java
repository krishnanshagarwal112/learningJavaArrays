public class MaxInArray {
    public static void main(String[] args) {
        int[] arr = {1,222,31,4030};
        System.out.println(max(arr));
    }
    static int max(int[] array){
        int max = array[0];
        for (int j = 0; j < array.length; j++) {
            if(array[j] > max){
                max = array[j];
            }
        }
        return max;
    }

}
