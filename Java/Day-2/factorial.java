import java.util.*;
public class factorial {
    
    public static void findFactorial(int n){
        if(n<0){
            System.out.println("invalid");
            return;
        }
        int factorial=1;
        for(int i=n;i>=1;i--){
            factorial=factorial*i;
        }
        System.out.print(factorial);
        return;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        findFactorial(n);
        in.close();
    }
}