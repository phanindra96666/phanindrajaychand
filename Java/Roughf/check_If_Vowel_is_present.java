import java.util.*;
public class check_If_Vowel_is_present {
    public static Boolean myfnc(String s){
        String S = s.toLowerCase();
        if(S.matches(".*[aeiou].*")){ 
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        System.out.println(myfnc(S));
        in.close();
    }
}