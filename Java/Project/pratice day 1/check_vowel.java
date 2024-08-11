import java.util.Scanner;
public class check_vowel {
    public static Boolean myfun(String S){
        String s = S.toLowerCase();
        if(s.matches(".*[aeiou].*")){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        String S = in.nextLine();
        System.out.println(myfun(S));
        in.close();
    }
}
