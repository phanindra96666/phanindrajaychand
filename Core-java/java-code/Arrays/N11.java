import java.util.*;

public class N11 {
    public static String repeatDigits(int num) {
        char [] digits = String.valueOf(num).toCharArray();
        Arrays.sort(digits);
        StringBuilder result = new StringBuilder();

        for (char d : digits) {
            int count = d - '0';
            for (int i = 0; i < count; i++) {
                result.append(d);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(repeatDigits(250));   // 2255555
        System.out.println(repeatDigits(251));   // 12255555
        System.out.println(repeatDigits(4352));  // 22333444455555
    }
}
