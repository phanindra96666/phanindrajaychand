import java.util.*;

public class Q12 {
    public static void main(String[] args) {
        int[] arr = {10, 5, 11, 16, 14, 11, 10, 7, 8, 16, 16};
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        
        for (int i = 0; i < arr.length; i++) {
            if (!list1.contains(arr[i])) {
                list1.add(arr[i]);
            } else {
                if (!list2.contains(arr[i])) {
                    list2.add(arr[i]);
                }
            }
        }

        for (int i = 0; i < list1.size(); i++) {
            if (list2.contains(list1.get(i))) {
                System.out.print(list1.get(i) + " ");
            }
        }

        for (int i = 0; i < list2.size(); i++) {
            System.out.print(list2.get(i) + " ");
        }
    }
}
