import java.util.Scanner;
public class Multiples {
    public void m1(int a , int b){
        for (int i = a; i <= b; i++) {
            if (i%4==0||i%6==0) {
                System.out.print(i+" ");
            }
        }
    }
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Multiples obj = new Multiples();
        int a = in.nextInt();
        int b = in.nextInt();
        obj.m1(a, b);
        in.close();
    }
}
