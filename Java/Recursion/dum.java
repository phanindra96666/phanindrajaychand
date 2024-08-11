import java.util.*;
public class dum {
    public static boolean isPalindrome(String x){
        String result="";
        for(int i=0;i<x.length()-1;i++){
            char ch = x.charAt(i);
            result=ch+result;
        }
        if(result.equals(x)){
            return true;
        }
        else{
            return false;
        }
        
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String x = in.next();
        if(isPalindrome(x)){
            System.out.print("true");
        }
        else{
            System.out.print("false");
        }
        in.close();
    }
}
