public class N1 {
    public static void main(String[] args) {
        int[] arr = {11, 34, 67};
        for (int i = 0; i < arr.length; i++) {
            arr[i] = reverse(arr[i]);
        }
        
        System.out.print("Output: ");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int reverse(int num) {
        int rev = 0;
        while (num > 0) {
            rev = rev * 10 + num % 10;
            num /= 10;
        }
        return rev;
    }
}
