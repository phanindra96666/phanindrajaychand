import java.util.Arrays;
public class copyOfRange {
    public static void main(String[] args) {
        int [] arr = {10, 20, 15, 22, 35 };
        System.out.print(Arrays.toString(arr));
        System.out.println();
        System.out.print(Arrays.toString(Arrays.copyOfRange(arr, 1, 3)));
    }
}
