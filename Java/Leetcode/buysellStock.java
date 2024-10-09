public class buysellStock {
    public static int maxLoss(int[] arr, int n) {
        int max = Integer.MIN_VALUE;
        int result = 0;
        for(int i=0;i<n;i++){
            if (arr[i]>max) {
                max = arr[i];
            }
            if (max-arr[i]>result) {
                result=max-arr[i];
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int n = 7;
        int [] arr = {1,8,4,2,10,3,2};
        System.out.println(maxLoss(arr,n));
    }

    
}
