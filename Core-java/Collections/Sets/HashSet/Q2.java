import java.util.HashSet;

public class Q2 {
    public static void main(String[] args) {
        HashSet<Integer> intSet = new HashSet<>();
        for (int i = 1; i <= 10; i++) {
            intSet.add(i);
        }
        System.out.println("HashSet with integers from 1 to 10: " + intSet);
    }
}
