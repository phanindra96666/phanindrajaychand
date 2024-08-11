import java.util.*;
public class no {
    public static int myfun(int a,int m,int rs){
        int mango;
        if (a>=0 || m>=0 || rs>=0) {
        if (a>m){
            mango= a-m;
            rs=rs-mango;
        }
        else if(a<m){
            mango=m-a;
            rs=rs-mango;
        }
     }
        return rs;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int m = in.nextInt();
        int rs = in.nextInt();
        int result = myfun(a,m,rs);
        System.out.print(result);
        in.close();
    }
}