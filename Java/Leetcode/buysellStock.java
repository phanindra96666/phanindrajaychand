public class buysellStock {
    public static int maxLoss(int[] arr, int n) {
        if (n == 0) {
            return 0;
        } 
        int max = arr[0];
        int result = 0;

        for (int i = 1; i < n; i++) {
            if (arr[i] < max) {
                max = arr[i];
            }
            
            if (result<arr[i]-max) {
                result = arr[i]-max;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int n = 7;
        int[] arr = {1, 8, 4, 2, 10, 3, 2};
        System.out.println(maxLoss(arr, n));
    }
}
