import java.util.Scanner;
public class For_loop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //int result = 0;
        // String s = in.nextLine();
        int a = in.nextInt();
        int b = in.nextInt();
        for (int i = a; i <= b; i++) {
            if (i%2==0) {
                System.out.print(i+" ");
            }
        }
        //System.out.println(result);
        in.close();
    }
}
