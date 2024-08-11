import java.util.*;
public class reverse_words {
    public static String reverseString(String S){
        String [] arr = new String[10];
        arr=S.split(" "); 
        String result="";
        for(int i=0;i<arr.length;i++){
            result=arr[i]+" "+result;
        }
        return result;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String S  = in.nextLine();
        String h=reverseString(S);
        System.out.println(h);
        in.close();
    }
}