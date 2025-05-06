/*Create a java application where we have one abstract class it contains two abstract methods then 
inherited this class into another abstract class that contains two more abstract methods , one defined
method and one parameterized constructor then inhered this class into concrete class to provide funnality 
for all abstract methods and then invoke all propriety under main method by providing inputs.*/



import java.util.Scanner;
abstract class A {
static Scanner sc = new Scanner(System.in);
    abstract void m1(int a);
    abstract void m2(String s);
}

abstract class B extends A {
    B(int a) {
         System.out.print(a);
    }
    @Override
    void m1(int a){
	System.out.print(a);
    }

    @Override
    void m2(String s){
	System.out.print(s);
    }

    abstract void m3();
    abstract int m4(int n);

    void m5() {
        System.out.println("Defined method m5() called:");
    }
}

class C extends B {

    C() {
        super(sc.nextInt());
    }
    @Override
    void m3() {
        System.out.println("Hello");
    }
    @Override
    int m4(int n) {
        System.out.println(n);
	return n;
    }
}

public class J004 {
    public static void main(String[] args) {
        C obj = new C();
        obj.m1(A.sc.nextInt());
        obj.m2(A.sc.next());
        obj.m3();
        obj.m4(A.sc.nextInt());
	    obj.m5();
    }
}
