import java.util.*;
public class check_Palindrome {
   public static Boolean myfnc(String S){
      String result="";
      int len = S.length();
      for(int i=0;i<len;i++){
         result = S.charAt(i)+result;
      }
      if (result.matches(S)) {
         return true;
      }
      else{
         return false;
      }
   }
      public static void main(String args[]){
         Scanner in = new Scanner(System.in);
         String S = in.next();
         System.out.print(myfnc(S));
         in.close();
      }
}