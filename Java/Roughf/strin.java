import java.util.Scanner;
public class strin {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        String s = new String(in.nextLine());
        System.out.println(n);
        System.out.println(s);
        in.close();
    }
}
