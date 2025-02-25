public class Maximum_Subarray {
    public static void main(String[] args) {
        int[] nums = {5,4,-1,7,8};
        System.out.println(maxSubArray(nums));
    }
    public static int maxSubArray(int[] nums){
        int result = nums[0];
        int max = nums[0];
        for(int j=1;j<nums.length;j++){
            if (result<0) {
                result = nums[j];
            }
            else{
                result+=nums[j];
            }
            if (result>max) {
                max = result;
            }
        }
        return max;
    }
}