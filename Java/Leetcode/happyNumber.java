import java.util.*;
public class happyNumber {
    public static boolean checkHappyNumber(int n) {
        HashSet<Integer>seen = new HashSet<>();
        if (n==1) {
            return true;
        }

        if (seen.contains(n)) {
            return false;
        }
        
        seen.add(n);
        int result = 0;
        while (n>0) {
            int a = n%10;
            result+=a*a;
            n=n/10;
        }
       return checkHappyNumber(result);
    }
    public static void main(String[] args) {
        int n = 19;
        System.out.print(checkHappyNumber(n));
    }

    
}