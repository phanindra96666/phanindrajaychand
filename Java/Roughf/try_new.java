import java.util.Scanner;

public class try_new {
    public static long myfnc(long n){
        int digit = (int)Math.log10(n) + 1;
        for(int i = 3; i < digit; i++){
            n = n / 10;
        }
        long m;
        long result = 0;
        int di = (int)Math.log10(n) + 1;
        for(int i = 0; i < di; i++){
            m = n % 10;
            result += m;
            n = n / 10;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        System.out.println(myfnc(n));
        in.close();
    }
}
