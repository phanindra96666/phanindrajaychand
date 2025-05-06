import java.util.Scanner;
class A {
    static Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    A(){
        this(sc.nextInt());
        System.out.println("Hi dc is calling");
    }
    A(int h){
        System.out.println("Hi pc is caling");
    }
    public int m1(int a){
        System.out.println(this.a);
        System.out.println(a);
        this.m2(sc.nextInt());
        return sc.nextInt();
    }
    public int m2(int str) {
        return sc.nextInt();
    }
}
class kk extends A{
    kk(){
        super();
    }
    public int m1(int a){
        System.out.println(super.a);
        System.out.println(a);
        super.m1(sc.nextInt());
        return sc.nextInt();
    }
}
public class J007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        kk obj = new kk();
        obj.m1(sc.nextInt());
        sc.close();
    }
}