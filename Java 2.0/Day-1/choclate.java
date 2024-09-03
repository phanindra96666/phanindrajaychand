import java.util.Arrays;

public class choclate {
    public static int chocolateDistribution(int[] arr,int m){
        if (arr.length==0 || m==0 || m > arr.length) {
            return 0;
        }
        Arrays.sort(arr);
        int min_diff = Integer.MAX_VALUE;
        for(int i=0;i<=arr.length-m;i++){
            int diff = arr[i + m - 1] - arr[i];
            min_diff = Math.min(min_diff, diff);
        }
        return min_diff;
    }
    public static void main(String[] args) {
        int [] arr = {12, 4, 7, 9, 2, 23, 25, 41, 30, 40, 28, 42, 30, 44, 48, 43, 50};
        int m = 7;
        System.out.println(chocolateDistribution(arr, m));
    }
}
