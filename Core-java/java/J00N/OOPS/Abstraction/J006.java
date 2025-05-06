/*Create a java application where we have one abstract class, which contains one parameterized constructor, one defined method, and two abstract methods, we also have one concrete class which contains one defined method and one parameterized constructor, then inherit both these classes into another concrete class to provide functionality for abstract methods and invoke all the properties under main method by providing dynamic inputs.*/

import java.util.Scanner;
abstract class A {
static Scanner sc = new Scanner(System.in);
    A(int a){
	System.out.print(a);
    }
    abstract void m1(int a);
    abstract void m2(String s);
    void m3() {
        System.out.println("Hello");
    }
}

class B {
static B obj1 = new B(A.sc.nextInt());
    B(int n) {
        System.out.print(n);
    }
    void m4() {
        System.out.println("Hiii");
    }
}

class C extends A{ 
    C(){
	super(sc.nextInt());
    }
    @Override
    void m1(int a) {
        System.out.println("Hello");
    }
    @Override
    void m2(String s) {
        System.out.println(s);
    }
}
class Test{
    public static void main(String[] args) {
    C obj = new C();
	obj.m1(A.sc.nextInt());
	obj.m2(A.sc.next());
	obj.m3();
	B.obj1.m4(); 
    }
}