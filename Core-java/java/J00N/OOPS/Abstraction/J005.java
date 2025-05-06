/*Create a java application where we have one concrete class, it contains one parameterized constructor and one defined method, inherit this class into an abstract class that contains one parameterized constructor, one defined method, and two abstract methods, and inherit this class into another concrete class to provide functionality and then invoke all the properties under main method by providing dynamic inputs.*/



import java.util.Scanner;
class Z{
static Scanner sc = new Scanner(System.in);
    Z(int n){
	System.out.print(n);
    }
    public void m9(){  
	System.out.print("Hello");
    }
}

abstract class A extends Z {
     A(int n){
   	super(sc.nextInt());
     }
    abstract void m1(int a);
    abstract void m2(String s);
    void m5(){
	System.out.print("hiii");
    }
}

class B extends A {
    B() {
         super(sc.nextInt());
    }
    @Override
    void m1(int a){
	System.out.print(a);
    }

    @Override
    void m2(String s){
	System.out.print(s);
    }

    void m3() {
        System.out.println("Defined method m5() called:");
    }
}

class Main {
    public static void main(String[] args) {
        B obj = new B();
        obj.m1(B.sc.nextInt());
        obj.m2(B.sc.next());
        obj.m3();
        obj.m5();
	obj.m9();
    }
}
