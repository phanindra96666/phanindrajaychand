import java.util.Scanner;
public class RevString {
    public static void revString(String s,int i,String res){
        if (s.length()-1>=i) {
            revString(s, i+1, s.charAt(i)+res);
        }
        else{
            System.out.println(res);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        revString(s,0,"");
        sc.close();
    }
}