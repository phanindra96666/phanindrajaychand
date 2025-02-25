public class missing_number {
    public static void main(String[] args) {
        int [] nums = {1,0,3};
        int n = nums.length;
        int maxtotal = n*(n+1)/2;
        int total = 0;
        for(int num:nums){
            total+=num;
        }
        System.out.print(maxtotal-total);
    }
}
