import java.util.Scanner;

public class Common {
    public void m1(int a,int b){
        for (int i = a; i <= b; i++) {
            if (i%6==0 && i%4==0) {
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args) {
        Common obj = new Common();
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        obj.m1(a, b);
        in.close();
    }
}
