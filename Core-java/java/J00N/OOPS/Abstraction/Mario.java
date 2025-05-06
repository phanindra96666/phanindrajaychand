import java.util.Scanner;
abstract class A{
	static Scanner sc = new Scanner(System.in);
	abstract int m1(float a);
	abstract boolean m2(char c);
	abstract double m3(long l);
	A(int a){
		System.out.println(a);
	}
}
class B extends A{
	@Override
	int m1(float a){
		System.out.println(a);
		System.out.println("B-m1");
		return sc.nextInt();
	}
	@Override
	boolean m2(char c){
		System.out.println(c);
		System.out.println("B-m2");
		return sc.nextBoolean();
	}
	@Override
	double m3(long l){
		System.out.println(l);
		System.out.println("B-m3");
		return sc.nextDouble();	
	}
	B(){
		super(sc.nextInt());
	}
}
class C extends A{
	@Override
	int m1(float a){
		System.out.println(a);
		System.out.println("C-m1");
		return sc.nextInt();
	}
	@Override
	boolean m2(char c){
		System.out.println(c);
		System.out.println("C-m2");
		return sc.nextBoolean();
	}
	@Override
	double m3(long l){
		System.out.println(l);
		System.out.println("C-m3");
		return sc.nextDouble();	
	}
	C(){
		super(sc.nextInt());
	}
}
class D extends A{
	@Override
	int m1(float a){
		System.out.println(a);
		System.out.println("D-m1");
		return sc.nextInt();
	}
	@Override
	boolean m2(char c){
		System.out.println(c);
		System.out.println("D-m2");
		return sc.nextBoolean();
	}
	@Override
	double m3(long l){
		System.out.println(l);
		System.out.println("D-m3");
		return sc.nextDouble();	
	}
	D(){
		super(sc.nextInt());
	}
}

class Test{
	A display(A obj){
		System.out.println(obj.m1(A.sc.nextFloat()));
		System.out.println(obj.m2(A.sc.next().charAt(0)));
		System.out.println(obj.m3(A.sc.nextLong()));
		return obj;	
	}
	public static void main(String[]args){
		Test t = new Test();
		int input = A.sc.nextInt();
		switch(input){
			case 1: System.out.println(t.display(new B())); break;
			case 2: System.out.println(t.display(new C())); break;
			case 3: System.out.println(t.display(new D())); break;
			default: System.out.println("Invalid Input");
		}		
	}
}
