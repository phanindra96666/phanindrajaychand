import java.util.Scanner;
public class upperCase {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       int n = in.nextInt();
       String nn = Integer.toString(n);
       for(int i=4;i<=nn.length();i++){
        n=n/10;
       }
       int su = 0;
       while(n!=0){
         su+=n%10;
         n=n/10;
       }
       System.out.println(su);
       in.close();
    }
}