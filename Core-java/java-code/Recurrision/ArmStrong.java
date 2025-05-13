import java.util.Scanner;
public class ArmStrong {
    public static int isArmStrong(int n,int len){
        if (n==0) {
           return 0;
        }
        return (int)Math.pow(n%10, len)+isArmStrong(n/=10, len);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int len = (int)Math.log10(n)+1;
        if (isArmStrong(n,len)==n) {
            System.out.println("True");
        }
        else{
            System.out.print("False");
        }
        sc.close();
    }
}
