public class rotatetoRight {
    public static void rotate(int[] arr , int k){
        int n= arr.length;
        if (k == 0) return;
        reverse(arr, 0, n-1);
        reverse(arr, 0, k-1);
        reverse(arr, k, n - 1);
    }

    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 2;
        rotate(arr, k);
        printArray(arr);
    }
}
