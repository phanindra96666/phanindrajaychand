/*Create a java application where we have two interfaces with respect to individual 
abstract methods, one abstract class which contains one parameterized constructor, 
one defined method, and one abstract method, we also have one concrete class which 
contains one defined method, then inherit all the templates into one concrete class
to provide functionality for abstract methods and invoke all the methods under main
by providing dynamic inputs.*/

import java.util.Scanner;
import static java.lang.System.out;

interface I1{
	int m1(float a);
}
interface I2{
	boolean m2(char c);
}
abstract class A{
	static Scanner sc = new Scanner(System.in);
	A(int a){
		out.println(a);
	}
	abstract double m3(long l);
	String m4(byte b){
		out.println(b);
		return sc.next();
	}
}
class B{
	void m5(short s){
		out.println(s);
	}
}

class C extends A implements I1,I2{
	C(){
		super(sc.nextInt());
	}
	@Override
	double m3(long l){
		out.println(l);
		return sc.nextDouble();
	}
	@Override
	public boolean m2(char c){
		out.println(c);
		return sc.nextBoolean();
	}
	@Override
	public int m1(float a){
		out.println(a);
		return sc.nextInt();
	}
}

public class J005{
	public static void main(String...args){
		I1 i1 = new C();
		I2 i2 = (C)i1;
		A a = (C)i2;
		B b = new B();
		out.println(i1.m1(A.sc.nextFloat()));
		out.println(i2.m2(A.sc.next().charAt(0)));
		out.println(a.m3(A.sc.nextLong()));
		out.println(a.m4(A.sc.nextByte()));
		b.m5(A.sc.nextShort());
	}
}