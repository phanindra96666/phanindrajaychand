import java.util.Scanner;
public class Reverse {
    public static void isReverse(int n,int rev){
        if (n>0) {
            rev = rev*10+n%10;
            isReverse(n/=10, rev);
        }
        else{
            System.out.println(rev);
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        isReverse(sc.nextInt(),0);
        sc.close();
    }
}
