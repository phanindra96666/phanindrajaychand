import java.util.HashMap;

public class LargestSubarrayWithZeroSum {

    public static int largestSubarrayWithZeroSum(int[] arr) {
        HashMap<Integer, Integer> sumMap = new HashMap<>();
        int cumulativeSum = 0;
        int maxLen = 0;
        for (int i = 0; i < arr.length; i++) {
            cumulativeSum += arr[i];//15->13->15->7->8->15->
            if (cumulativeSum == 0) {
                maxLen = i + 1;
            }
            else if (sumMap.containsKey(cumulativeSum)){
                maxLen = Math.max(maxLen, i - sumMap.get(cumulativeSum));//(0,2-0)=>2--->(2,4-0)=>4--->(4,5-0)=>5
            }
             else {
                sumMap.put(cumulativeSum, i);//(15:0)->(13:0)->(7:0)->(8:0)->
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
        int[] arr = {15, -2, 2, -8, 1, 7, 10, 23};
        System.out.println(largestSubarrayWithZeroSum(arr));
    }
}
