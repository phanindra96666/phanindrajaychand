import java.util.*;
public class string {
    public static void myfun(){
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.nextLine();
        String revStr[] = S.split("\\ ");
        String result ="";
        for(int i=revStr.length-1;i>=0;i--){
            result+=revStr[i];
            if(i!=0){
                result+=" ";
            }
        }
      System.out.print(result);
      in.close();
    }
}