import java.util.Scanner;
public class try_new {
    public static int myfnc(int n){
        int digit = (int)Math.log10(n)+1;
        for(int i=3;i<digit;i++){
            n=n/10;
        }
        int m;
        int reuslt = 0;
        int di = (int)Math.log10(n)+1;
        for(int i=0;i<di;i++){
            m=n%10;
            reuslt+=m;
            n=n/10;
        }
        return reuslt;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(myfnc(n));
        in.close();
    }
}