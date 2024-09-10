import java.util.*;
public class hashmap {
    public static Boolean isPair(int [] arr , int x){
        int n= arr.length;
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            int complement = x - arr[i];
            if (set.contains(complement)) {
                return true;
            }
            set.add(arr[i]);
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] = {11, 15, 6, 8, 9, 10};
        int x = 16;
        System.out.print(isPair(arr,x));
    }
}
