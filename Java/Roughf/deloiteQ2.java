import java.util.*;

public class deloiteQ2 {
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine(); 
        Set<Integer> primes = new TreeSet<>();

        int length = input.length();
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j <= length; j++) {
                int num = Integer.parseInt(input.substring(i, j));
                if (isPrime(num)) {
                    primes.add(num);
                }
            }
        }

        if (primes.isEmpty()) {
            System.out.println("No prime numbers found");
        } else {
            for (int prime : primes) {
                System.out.print(prime + " ");
            }
        }
        sc.close();
    }
}