import java.util.*;
public class cricularPrime{
    public static boolean isPrime(int n){
        if(n<2){
            return false;
        }
        if(n==2){
            return true;
        }
        if(n%2==0){
            return false;
        }
        for(int i=3;i<=Math.sqrt(n);i+=2){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean b = false;
        int digit = (int) Math.log10(n)+1;
        int reverse = n;
        for(int i=0;i<digit;i++){
            if(!isPrime(reverse)){
                System.out.print("No");
                return;
            }
            else{
                b = true;
            }
            reverse = rotated(reverse,digit);
        }
        if(b){
            System.out.println("prime");
        }
    }
    public static int rotated(int n,int digit){
        int first = n /(int) Math.pow(10,digit-1);
        int rest = n%(int)Math.pow(10,digit-1);
        return rest*10+first;
    }
}