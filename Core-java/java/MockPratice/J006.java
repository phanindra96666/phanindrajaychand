import java.util.Scanner;

public class J006 {
    static Scanner sc = new Scanner(System.in);
    static int a;
    static int b;
    J006(){
    }
    J006(int a,int b) {
        this.a = a;
        this.b = b;
    }
    public int m1(int a) {
        return sc.nextInt();
    }
    public int m2(String str) {
        return sc.nextInt();
    }

    public static void main(String[] args) {
        J006 obj = new J006();
        int input1 = obj.m1(sc.nextInt());
        int input2 = obj.m2(sc.next());
        new J006(input1,input2);
        System.out.println("a:"+a);
        System.out.println("b:"+b);

     }
}