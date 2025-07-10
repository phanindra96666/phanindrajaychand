import java.util.Arrays;
import java.util.Scanner;

public class N14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of elements:");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        Arrays.sort(arr);
        double median;
        if (n % 2 == 0) {
            median = (double)(arr[n/2 - 1] + arr[n/2]) / 2;
        } else {
            median = arr[n/2];
        }

        System.out.println("Median = " + median);
    }
}
