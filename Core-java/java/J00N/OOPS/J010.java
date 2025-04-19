/*Create a Java app where we have one class it contains one DC then inherit this class into the DC of another class then inherit this class into the PC of another class and then this class into the PC of another class and then inherit this class into the DC of another class. then if we invoke the bottommost derived class constructor under the main method from there it has to invoke intermediate base class constructors by using the super keyword and then from there it has to invoke top most base class constructor by using a super keyword by giving dynamic inputs
*/

import java.util.Scanner;

 class A{
    static Scanner sc = new Scanner(System.in);
	A(){
		System.out.println("A calling");
	}
}

 class B extends A{
	B(){
	super();
	System.out.println("B is calling");
	}
}
class C extends B{
	C(int c){	
	super();	
	System.out.println("C is calling");
	}

}
class D extends C{
	D(int c){	
	super(sc.nextInt());
	System.out.println("D is calling");
	}

}
class E extends D{
	E(){
	super(sc.nextInt());
	System.out.println("E is calling");
	}	
}

class test{
	public static void main(String[] args){
	E obj = new E();	
	}
}