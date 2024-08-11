import java.util.Scanner;
public class second {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        n=n+n;
        System.out.println(n);
        in.close();
    }
}