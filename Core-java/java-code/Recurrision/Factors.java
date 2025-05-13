import java.util.Scanner;
public class Factors {
    public static void isFactors(int n,int i){
        if (i<=n) {
            if (n%i==0) {
                System.out.println(i);
            }
            isFactors(n, i+1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        isFactors(sc.nextInt(),1);
        sc.close();
    }
}
