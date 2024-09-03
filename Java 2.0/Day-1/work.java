public class work {
    public static int myMythod(int[] arr){
        int sum=0;
        int n = arr.length;
        // Reversing an array 
        for(int i = 0; i < n / 2; i++){
            int temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }
        // Making the sum
        for(int i=arr.length-1;i>=0;i--){
            if (arr[i]%2==0) {
                sum+=arr[i];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int [] arr = {2,5,7,9,3,8};
        System.out.println(myMythod(arr));
    }
}
