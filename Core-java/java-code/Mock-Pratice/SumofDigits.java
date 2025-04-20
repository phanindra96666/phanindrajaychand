import java.util.Scanner;
public class SumofDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = 0;
        int digit = 0;
        while (n>0) {
            int r = n%10;
            digit = digit*10+r;
            n/=10;
        }
        while (digit>0){
            int r = digit%10;
            c++;
            if (c!=1) {
                System.out.print(" + ");
            }
            System.out.print(r);
            digit/=10;
        }
        System.out.print(".");
    }
}