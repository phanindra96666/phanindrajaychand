import java.util.*;
public class Four {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = {1, 2, 3, 4, 5};
        int len = arr.length;
        int n = sc.nextInt();
        int[] rotated = new int[len];
        for (int i = 0; i < len; i++) {
            rotated[(i + n) % len] = arr[i];//right
            rotated[(i + len - n) % len] = arr[i];//left

        }

        for (int i = 0; i < len; i++) {
            System.out.print(rotated[i] + " ");
        }
    }
}
