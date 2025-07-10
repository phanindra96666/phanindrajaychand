import java.util.ArrayList;
import java.util.List;

public class N3 {
    public static void decimalToBinary(int num) {
        List<Integer> binary = new ArrayList<>();
        while (num > 0) {
            binary.add(0, num % 2);
            num /= 2;
        }
        System.out.println("Binary: " + binary);
    }
    public static void main(String[] args) {
        int n = 84;
        decimalToBinary(n);
    }

}
