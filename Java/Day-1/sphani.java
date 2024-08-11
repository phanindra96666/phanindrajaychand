import java.util.Scanner;

public class sphani {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n = in.nextInt();
        for(int i=0;i<=n;i++){
            for(int k=1;k<=i;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=n-i;j++){
                System.out.print("*");   
            }
            System.out.println();
        }
        in.close();
    }
}
