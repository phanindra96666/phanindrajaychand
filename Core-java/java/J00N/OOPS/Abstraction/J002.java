import java.util.Scanner;
abstract class A{
    static Scanner sc = new Scanner(System.in);
    abstract int m1(int n);
    abstract boolean m2();
    public void m3(){
        System.out.println("M3 is calling");
    }
}
public class J002 extends A{
    @Override
    int m1(int n) {
        return (n+sc.nextInt());
    }
    @Override
    boolean m2() {
        return sc.nextBoolean();
    }
    public static void main(String[] args) {
        J002 obj = new J002();
        System.out.println(obj.m1(sc.nextInt()));
        System.out.println(obj.m2());
        obj.m3();
    }
}
