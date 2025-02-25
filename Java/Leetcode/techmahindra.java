public class techmahindra {
    public static int findDifference(int n, int[] arr) {
        int odd = 0;
        int even =0;
        for (int i = 0; i < arr.length; i++) {
            if (i%2==0) {
                odd+=arr[i];
            }
            else{
                even+=arr[i];
            }
        }
        return odd-even;
    }
    public static void main(String[] args) {
        int n = 7;
        int [] arr = {10,20,30,40,50,60,70};
        System.out.print(findDifference(n,arr));
    }

   
}
