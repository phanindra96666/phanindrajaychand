public class slidingWindow {
    public static int maxSum(int[] arr, int k) {
        int n = arr.length;
        if (n < k) {
            return -1;
        }
        int sum=0;
        for (int i = 0; i < k; i++) {
            if (arr[i]>sum) {
                sum=arr[i];
            }
        }
        int cursum = sum;
        for (int i = k; i < n; i++) {
            cursum+=arr[i]-arr[i-k];
            sum = Math.max(sum,cursum);
        }
        
        return sum;
    }
    public static void main(String[] args) {
        int [] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;
        System.out.println(maxSum(arr, k));
    }
}