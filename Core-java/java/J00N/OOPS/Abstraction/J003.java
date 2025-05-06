import java.util.Scanner;
abstract class A{
    A(int n){
        System.out.println("hello");
    }
    static Scanner sc = new Scanner(System.in);
    abstract int m1(int n);
    abstract boolean m2();
    public void m3(){
        System.out.println("M3 is calling");
    }
}
public class J003 extends A{
    J003(){
        super(sc.nextInt());
    }
    @Override
    int m1(int n) {
        return (n+sc.nextInt());
    }
    @Override
    boolean m2() {
        return sc.nextBoolean();
    }
    public static void main(String[] args) {
        J003 obJ003 = new J003();
        System.out.println(obJ003.m1(sc.nextInt()));
        System.out.println(obJ003.m2());
        obJ003.m3();
    }
}
