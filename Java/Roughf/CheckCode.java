import java.util.Scanner;
public class CheckCode {
    public static int isPrime(int n){
        int c = 0;
        int i;
        for(i=2;i*i<n;i++){
            if (n%i==0) {
                c++;
            }
        }
        if (c==0) {
            return n;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int sum = 0;
        int c =0;
        for (int i = a; i<b; i++) {
            int e = isPrime(i);
            if (e!=-1) {
                c++;
               sum+=e;
            }
        }
        System.out.println(sum/c);
    }
}
