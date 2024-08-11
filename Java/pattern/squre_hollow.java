import java.util.Scanner;
public class squre_hollow {
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = 5;
        for(int i=0;i<=n;i++){
            for(int j=0;j<=n;j++){
                if (i==0||i==n||j==0||j==n) {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        in.close();
    }
}