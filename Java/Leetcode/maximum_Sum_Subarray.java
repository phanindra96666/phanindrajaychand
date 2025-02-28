import java.util.*;
public class maximum_Sum_Subarray { 
    public static int maxSumSubarrayWithDistinctElements(int[] arr, int k) {
        int n = arr.length;
        if (n<k) {
            return 0;
        }
        int maxSum = Integer.MIN_VALUE;
        for(int i=0;i<=n-k;i++){
            HashSet<Integer> windowSet = new HashSet<>();
            int currentSum = 0;
            for(int j=i;j<i+k;j++){
                if (!windowSet.add(arr[j])){
                    currentSum = -1;
                    break;
                }
                currentSum+=arr[j];
            }
            if (currentSum!=-1){
                maxSum = Math.max(maxSum, currentSum);
            }
           //System.out.println(windowSet);
        }
         return maxSum;      
    }
    public static void main(String[] args) {
        int[] arr = {1, 5, 4, 2, 9, 9, 9};
        int k = 3;
        int result = maxSumSubarrayWithDistinctElements(arr, k);
        System.out.println(result);
    }     
}