import java.util.Scanner;
public class Pttern {
   public static long isFib(int n){
        if (n == 0){
            return 0;
        }
        if (n == 1){ 
            return 1;
        }
        long a = 0, b = 1, c = 0;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
   }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int currentindex = 1;
        int o = 0;
        for(int i=1;i<=n;i++){
            o++;
            for(int j=1;j<=i;j++){
                if (i%2==0) {
                    System.out.print(currentindex+" ");
                    currentindex +=2;
                }
                else{
                    System.out.print(currentindex+" ");
                    currentindex +=2;
                }
            }
            currentindex += Math.pow(2, o);
            System.out.println();
        }

    }
}
