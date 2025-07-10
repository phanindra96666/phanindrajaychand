import java.util.Scanner;
public class CheckPalindromeString {
    public static String checkPalindrome(String s,int i,String res){
        if (s.length()-1>=i) {
            return checkPalindrome(s, i+1, s.charAt(i)+res);
        }
        else{
            return res;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String res = checkPalindrome(s,0,"");
        if (res.equals(s)) {
            System.out.println("True");
        }
        else{
            System.out.print("False");
        }
        sc.close();
    }
}
