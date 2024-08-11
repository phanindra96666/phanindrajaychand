import java.util.Scanner;
public class my_Letter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 5;  
        for (int i = 0; i < n; i++){
            System.out.print("*");
            for (int j = 0; j < n; j++){
                if ((i == 0 || i == n / 2)){
                    System.out.print("*");
                } else if (j==n-i && i<=n/2){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
            in.close();
        }
    }
}
