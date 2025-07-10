public class N4 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4};
        int target = 2;
        System.out.print("Output: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != target) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
