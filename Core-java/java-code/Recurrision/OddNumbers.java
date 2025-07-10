import java.util.Scanner;
public class OddNumbers {
    public static void isOdd(int n,int m){
        if (n<m) {
            if (n%2==1) {
                System.out.println(n);   
            }
            isOdd(n+1, m);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        isOdd(n, m);
        sc.close();
    }
}
