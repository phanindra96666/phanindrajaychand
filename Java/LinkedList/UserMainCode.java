import java.util.Scanner;

class UserMainCode {
    public static int maxSongs(String S, int K) {
        int n = S.length();
        if (K > n) {
            return 0;
        }
        int currentCount = 0;
        for (int i = 0; i < K; i++) {
            if (S.charAt(i) == 'a') {
                currentCount++;
            }
        }
        int maxCount = currentCount;
        for (int i = K; i < n; i++) {
            if (S.charAt(i) == 'a') {
                currentCount++;
            }
            if (S.charAt(i - K) == 'a') {
                currentCount--;
            }
            if (currentCount > maxCount) {
                maxCount = currentCount;
            }
        }

        return maxCount;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        int K = scanner.nextInt();
        int result = maxSongs(S, K);
        System.out.println( result);

        scanner.close();
    }
}