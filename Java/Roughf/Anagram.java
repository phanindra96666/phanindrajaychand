import java.util.Scanner;
import java.util.Arrays;
public class Anagram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String A = in.next();
        String B = in.next();
        char a1 [] = A.toLowerCase().toCharArray();
        char a2 [] = B.toLowerCase().toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);
        if (Arrays.equals(a1, a2)) {
            System.out.print("True");
        }
        else{
            System.out.print("False");
        }
        in.close();
    }
}