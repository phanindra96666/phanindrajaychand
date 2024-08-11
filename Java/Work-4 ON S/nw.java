import java.util.*;
public class nw {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i=1,p=n;i<=n;i++,p--){
            for(int j=1,q=n;j<=i;j++,q--){
                System.out.print(q);
            }
            for(int j=1;j<=n-i;j++){
                System.out.print(p);
            }
            System.out.println();
            in.close();
        }
    }
}
