import java.util.*;
public class two_arrays_contain_same_elements {
    public static void main(String[] args) {
        int [] arr1 = {1,2,3,2,1};
		int [] arr2 = {1,2,3};
		int [] arr3 = {1,2,3,4};
        System.out.println(sameElements(arr1,arr2));
        System.out.print(sameElements(arr2,arr3));
    }
        
    public static boolean sameElements(int[] a1, int[] a2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        for (int num : a1) {
            set1.add(num);
        }
        for (int num : a2) {
            set2.add(num);
        }
        if (set1.equals(set2)) {
            return true;
        }
        return false;
    }
}