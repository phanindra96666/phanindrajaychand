import java.util.Scanner;
public class PrimeNumber {
    public static boolean isPrime(int n,int i,int fc){
        if (i<=n) {
            if (n%i==0) {
                fc++;
            }
            return isPrime(n, i+1, fc);
        }
        else{
            return fc == 2;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (isPrime(sc.nextInt(),1,0)) {
            System.out.println("Prime");
        }
        else{
            System.out.println("Not prime");
        }
        sc.close();
    }
}
