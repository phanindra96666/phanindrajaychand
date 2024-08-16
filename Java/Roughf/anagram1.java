import java.util.Arrays;
import java.util.Scanner;
public class anagram1 {
    public static Boolean myfun(String s1,String s2){
            char [] s3 = s1.toLowerCase().toCharArray();
            char [] s4 = s2.toLowerCase().toCharArray();
            Arrays.sort(s3);
            Arrays.sort(s4);
        if(s3.length==s4.length && Arrays.equals(s3,s4)){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        String s1 = in.next();
        String s2 = in.next();
        Boolean result = myfun(s1,s2);
        System.out.println(result);
        in.close();
    }    
}