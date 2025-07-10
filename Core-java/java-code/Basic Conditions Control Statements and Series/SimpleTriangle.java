public class SimpleTriangle {
    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0) return false;
        return true;
    }

    public static int[] getPrimes(int n) {
        int[] primes = new int[n];
        int num = 2, count = 0;
        while (count < n) {
            if (isPrime(num)) {
                primes[count++] = num;
            }
            num++;
        }
        return primes;
    }

    public static int[] getFibonacci(int n) {
        int[] fib = new int[n];
        fib[0] = 0;
        if (n > 1){
            fib[1] = 1;
        }
        for (int i = 2; i < n; i++){
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        return fib;
    }

    public static void main(String[] args) {
        int rows = 5; 
        int total = rows * (rows + 1) / 2;

        int[] primes = getPrimes(total);
        int[] fibs = getFibonacci(total);

        int p = 0, f = 0, index = 0;

        for (int i = 1; i <= rows; i++) {
            for (int j = 0; j < i; j++) {
                if (index % 2 == 0) {
                    System.out.print(primes[p++] + " ");
                } else {
                    System.out.print(fibs[f++] + " ");
                }
                index++;
            }
            System.out.println();
        }
    }
}
