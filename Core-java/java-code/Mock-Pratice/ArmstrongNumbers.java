import java.util.Scanner;
public class ArmstrongNumbers {
    public static boolean isAmstrong(int n){
        int copy = n;
        int len = (int)Math.log10(n)+1;int digits = 0;
        while (n>0) {
            int r = n%10;
            digits += (int)Math.pow(r, len);
            n/=10;
        }
        return copy == digits;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n2 = sc.nextInt();
        if (n>0 && n2>0) {
            boolean flag = false;
            int c  = 0;
            for (int i=n;i<=n2;i++) {
                if (isAmstrong(i)) {
                    flag = true;
                    if (c==0) {
                        System.out.print(" Armstrong Numbers in the Given Range is ");
                    }
                    c++;
                    if (c!=1) {
                        System.out.print(", ");
                    }
                    System.out.print(i);
                }
            }
            if (flag) {
                System.out.print(".");
            }
            else{
                System.out.print("No Armstrong Numbers.");
            }
        }
        else{
            System.out.print("Invalid Inputs.");
        }
        
    }
}
