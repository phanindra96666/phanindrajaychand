
import java.util.*;
public class third {
    public static void highNum(int a,int b){
        if(a<b){
            System.out.print("b is higher:"+b);
        }
        else{
            System.out.print("a is higher:"+a);
        }
        return;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();

        highNum(a,b);
    }
}
