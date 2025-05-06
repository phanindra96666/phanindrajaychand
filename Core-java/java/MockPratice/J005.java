import java.util.Scanner;

public class J005 {
    static Scanner sc = new Scanner(System.in);
    public J005(char c) {

    }
    public void m1(int a, double b) {
        System.out.print("M1 calling");
    }
    public static double m2(String str) {
        return sc.nextDouble();
    }
    public static String m3(byte b) {
        return sc.next();
    }
    public int m4(float f) {
        return sc.nextInt();
    }

    public static void main(String[] args) {
        J005 obj = new J005(sc.next().charAt(0));
        obj.m1(obj.m4(sc.nextFloat()),obj.m2(m3(sc.nextByte())));
    }
}