import java.util.Scanner;
public class hours {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int[] arr = new int[n];

    for (int i = 0; i < n; i++) {
        arr[i] = in.nextInt(); 
    }
    int ans = 0;
    int mod = (int) (1e9 + 7);

    for (int i = 0; i < n-1; i++) {
        for (int j = i + 1; j<n; j++) {
            int temp = arr[i] + arr[j] ;
                if (temp % 60 == 0) {
                    ans++;
                    ans = ans % mod;

                }
            }
        }
    System.out.println(ans);
    in.close();
}
}