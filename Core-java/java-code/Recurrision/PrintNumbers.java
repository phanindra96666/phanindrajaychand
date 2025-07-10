import java.util.Scanner;
public class PrintNumbers {
    public static void printNumbers(int n,int m){
        if (n<=m) {
            System.out.println(n);
            printNumbers(n+1, m);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        printNumbers(sc.nextInt(),sc.nextInt());
        sc.close();
    }
}
