import java.util.Scanner;
public class palindrome{
    public static boolean check(String s){
        String res = "";
        for(int i=0;i<s.length();i++){
            res = s.charAt(i)+res;
        }
        if (res.matches(s)) {
            return true;
        }
        return false;
    } 
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        System.out.print(check(s));
        in.close();
    }

}