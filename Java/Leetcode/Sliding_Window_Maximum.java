import java.util.*;
public class Sliding_Window_Maximum {
    public static ArrayList<Integer> maxOfSubarrays(int []arr ,int k){
        int n = arr.length;
        ArrayList<Integer> result = new ArrayList<>();
        for(int i=0;i<n-k;i++){
            int max = arr[0];
            for(int j=0;j<k;j++){
                if (arr[j+i]>max) {
                    max=arr[i+j];
                }
            }
            result.add(max);
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 1, 4, 5, 2, 3, 6 };
        int k = 3;
        ArrayList<Integer> res = maxOfSubarrays(arr,k);
        for (int integer : res) {
            System.out.print(integer +" ");
        }
    }
}