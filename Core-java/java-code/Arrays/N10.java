import java.util.*;
public class N10 {
    public static int smallestPermutation(int num) {
        char[] digits = String.valueOf(num).toCharArray();
        Arrays.sort(digits);
        
        if (digits[0] == '0') {
            for (int i = 1; i < digits.length; i++) {
                if (digits[i] != '0') {
                    char temp = digits[0];
                    digits[0] = digits[i];
                    digits[i] = temp;
                    break;
                }
            }
        }

        return Integer.parseInt(new String(digits));
    }

    public static void main(String[] args) {
        System.out.println(smallestPermutation(250));      // 205
        System.out.println(smallestPermutation(251));      // 125
        System.out.println(smallestPermutation(2814851));  // 1124588
    }
}
