import java.util.Scanner;

public class IsPrime {
    public static boolean isPrime(int n){
        if (n <= 1) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;

        for (int i = 3; i * i <= n; i += 2){
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = 0;
        while (true) {
            int n = sc.nextInt();
            if (!isPrime(n)){
                break; 
            }
            else{
                c++;
            }
        }
        sc.close();
        System.out.println(c);
    }
}
//1:20:20 , 2:20:20;