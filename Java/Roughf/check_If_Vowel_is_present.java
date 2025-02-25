import java.util.*;
public class check_If_Vowel_is_present {
    public static Boolean myfnc(String s) { 
        String lowerCaseString = s.toLowerCase();
        if(lowerCaseString.matches(".*[aeiou].*")){ 
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String inputString = in.next();
        System.out.println(myfnc(inputString));
        in.close();
    }
}