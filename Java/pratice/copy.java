import java.util.*;
public class copy {
    public static void main(String[] args) {
        int [] arr = {10,20,30,40,50};
        System.out.print(Arrays.toString(arr));
        System.out.println();
        System.out.println("New Arrays by copyOf:");
        System.out.print(Arrays.toString(Arrays.copyOf(arr, 10)));
    }
}