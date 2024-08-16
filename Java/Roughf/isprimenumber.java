import java.util.Scanner;
public class isprimenumber {
    public static boolean isPrime(int n){ 
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int count = 0;
        int num = 2;

        while (count < n) { 
            if (isPrime(num)) { 
                System.out.println(num);
                count++;                 
            }
            num++;                       
        }
        in.close();
    }
}