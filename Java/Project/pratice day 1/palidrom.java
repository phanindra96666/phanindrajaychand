import java.util.Scanner;
public class palidrom {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        String S = in.next();
        String result="";
        for(int i=0;i<S.length();i++){
            result=S.charAt(i)+result;
        }
        if(result.equals(S)){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
        in.close();
    }  
}