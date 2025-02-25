public class find_subarray_with_odd_count {
    public static int countoddsumarray(int [] arr) {
        int n = arr.length;
        int oddsum = 0;
        for(int start=0;start<n;start++){
            int subarrsum = 0;
            for(int end=start;end<n;end++){
                subarrsum+=arr[end];
                if (subarrsum%2!=0) {
                    oddsum++;
                }
                // for(int k=start;k<end;k++){
                //     System.out.print(arr[k]+" ");
                // }
            }
        }
        return oddsum;
    }
    public static void main(String[] args) {
        int [] arr = {1,3,5};
        System.out.println(countoddsumarray(arr));
    }
}
