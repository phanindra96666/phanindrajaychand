import java.util.Scanner;
public class PrintRevNumbers {
    public static void printrev(int n,int m){
        if(m>=n){
            System.out.print(m+" ");
            printrev(n, m-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        printrev(n, m);
        sc.close();
    }
}
