import java.util.Scanner;
public class binary_search {
    public static int binarys(int [] arr,int target){
        int n = arr.length;
        int left = 0;
        int right = n-1;
        while (left<=right) {
            int mid = left+(right-left)/2;
            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid]<target) {
                left = mid+1;
            }
            else{
                right = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {3, 4, 5, 7, 9};
        int target = in.nextInt();
        int result = binarys(arr, target);
        System.out.println(result);
        in.close();
    }
}
