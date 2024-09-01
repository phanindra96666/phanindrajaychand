import java.util.*;
public class sum_Array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 5;
        int[] arr = {6,2,3,4,1};
        int min = Integer.MAX_VALUE;
        int min1 = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if (min>arr[i]) {
                min1 = min;
                min = arr[i];
            }
        }
        int sum =9;
        int result=0;
        if (min+min1<=sum) {
            result = min*min1;
        }
        System.out.println(result);
        in.close();
        }
}
