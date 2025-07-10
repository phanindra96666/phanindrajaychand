import java.util.Arrays;
public class N2 {
    public static void powerWithIndex(int[] arr) {
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = (int) Math.pow(arr[i], i + 1);
        }
        System.out.println("Powered array: " + Arrays.toString(result));
    }
    public static void main(String [] args){
        int [] arr = {3,4,2,1,3,5};
        powerWithIndex(arr);
    }

}
