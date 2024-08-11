import java.util.*;
public class mirror {
    public static void main(String[] args){
       Scanner in = new Scanner (System.in);
       int n = in.nextInt();
       for(int i=0;i<=n;i++){
        for(int j=0;j<=n-i;j++){
            System.out.print(" ");
        }
        for(int j=0;j<(i*2)+1;j++){
            System.out.print("*");
        }
        System.out.println();
       }
       for(int i=n;i>=0;i--){
        for(int j=0;j<=n-i;j++){
            System.out.print(" ");
        }
        for(int j=0;j<(i*2)+1;j++){
            System.out.print("*");
        }
        System.out.println();
       }
       in.close();
    }
}
