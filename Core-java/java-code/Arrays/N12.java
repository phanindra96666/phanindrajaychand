import java.util.*;
public class N12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[4];
        System.out.println("Enter 4 array elements:");
        for (int i = 0; i < 4; i++) {
            arr[i] = scanner.nextInt();
        }

        List<Integer> result = new ArrayList<>();
        result.add(arr[0]);
        result.add(arr[1]);

        int sum = arr[2] + arr[3];
        for (int i = 0; i < 3; i++) {
            result.add(sum);
            sum += arr[2];
            result.add(sum);
            sum += arr[3];
        }

        System.out.println("Output: " + result);
        scanner.close();
    }
}
