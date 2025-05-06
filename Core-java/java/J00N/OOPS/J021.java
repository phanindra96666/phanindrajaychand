import java.util.Scanner;
class PolyBase {
   static Scanner sc = new Scanner(System.in);
    void show(int a) {
        System.out.println("Base class: int " + a);
    }
    void show(String str) {
        System.out.println("Base class: String " + str);
    }
    void show(int a, int b) {
        System.out.println("Base class: int, int " + (a + b));
    }

}

class J021 extends PolyBase {

    @Override
    void show(int a, int b) {
        System.out.println("Derived class: int, int " + (a + b));
    }

    void m3(){
	show(sc.nextInt(),sc.nextInt());
	super.show(sc.nextInt(),sc.nextInt());
    }

    public static void main(String[] args) {
        J021 baseRef = new J021();
        baseRef.show(5);               
        baseRef.show("Java");
        baseRef.show(10, 20);
	baseRef.m3();
    }
}
