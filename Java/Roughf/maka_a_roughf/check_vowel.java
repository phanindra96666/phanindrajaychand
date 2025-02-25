import java.util.Scanner;
public class check_vowel{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        String s = S.toLowerCase();
        if (s.matches(".*[aeiou].*")) {
            System.out.print("True");
        }
        else{
            System.out.println("False");
        }
        in.close();
    }
}