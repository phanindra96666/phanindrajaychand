import java.util.*;
public class phani {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = "Total number of characters in a string";
        int count=0;
        for(int i=1;i<=S.length()-1;i++){
            if(S.charAt(i)!=' '){
                count++;
            }
           
        }
        System.out.println(count);
        in.close();

    }
}