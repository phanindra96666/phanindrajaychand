public class count_tomake_zero {
    public static void makeZero(int n) {
        int count = 0;
        while (n > 0) {
            int max = 0;
            int temp = n;
           
            while (temp > 0) { // for find the max 
                int select = temp % 10;
                max = Math.max(max, select);
                temp /= 10;
            }
            n = n - max; 
            count++;
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        int n = 24;
        makeZero(n);
    }
}