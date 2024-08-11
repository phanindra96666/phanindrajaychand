import java.util.Scanner;
public class check_vowel {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        if(S.matches(".*[aeiou].*")){
            System.out.println("vowel is present");
        }
        else{
            System.out.println("Vowel is not present");
        }
        in.close();
    }
}
