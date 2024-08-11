import java.util.*;
public class mulfun {
    public static int mulTwoNum(int a,int b){
        int mul=a*b;
        return mul;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        
        int multiple = mulTwoNum(a,b);
        System.out.println("The Two Mul Number is: "+multiple);
        in.close();
    }
}