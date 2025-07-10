import java.util.*;

public class Q11 {
    public static void main(String[] args) {
        int[] arr = {10, 5, 11, 16, 14, 11, 10, 7, 8, 16, 16};
        ArrayList<Integer> list = new ArrayList<>();

        for (int num : arr) {
            list.add(num);
        }

        HashSet<Integer> printed = new HashSet<>();

        for (int i = 0; i < list.size(); i++) {
            int count = 0;
            int current = list.get(i);

            for (int j = 0; j < list.size(); j++) {
                if (list.get(j).equals(current)) {
                    count++;
                }
            }

            if (count >= 2 && !printed.contains(current)) {
                System.out.print(current + " ");
                printed.add(current);
            }
        }
	System.out.println();

        for (int i = 0; i < list.size(); i++) {
            int count = 0;
            int current = list.get(i);

            for (int j = 0; j < list.size(); j++) {
                if (list.get(j).equals(current)) {
                    count++;
                }
            }

            if (count == 1) {
                System.out.print(current + " ");
            }
        }
    }
}
