import java.util.*;
public class find_the_second_largest_in_array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = in.nextInt();
        }
        System.out.println(second_largest(arr,n));
        in.close();
    }
        
    public static int second_largest(int[] arr , int n) {
        int largest = Integer.MIN_VALUE;
        int second_lagest = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if (largest<arr[i]) {
                second_lagest = largest;
                largest = arr[i];
            }   
        }
        return second_lagest;
    }
}