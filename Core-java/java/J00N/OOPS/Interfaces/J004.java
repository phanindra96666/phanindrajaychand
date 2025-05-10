/*Create a java application where we have two interfaces with respect to individual 
abstract methods, inherit these interfaces into one more interface which contains one 
abstract method and one defined method, then inherit this interface into an abstract class 
where we have one parameterized constructor, one defined method and one abstract method,
then inherit this class into a concrete class where we need to provide functionality for 
all the abstract methods and invoke all the properties under main by providing dynamic inputs.*/

import java.util.Scanner;
import static java.lang.System.out;
interface I1{
	int m1(float a);
}
interface I2{
	boolean m2(char c);
}
interface I extends I1,I2{
	Scanner sc = new Scanner(System.in);
	static double m3(long l){
		out.println(l);
		return sc.nextDouble();
	}
	long m4(double d);
}
abstract class A implements I{
	A(int a){
		out.println(a);
	}
	char m5(boolean b){
		out.println(b);
		return sc.next().charAt(0);
	}
	abstract float m6(int a);
}
class B extends A{
	B(){
		super(sc.nextInt());
	}
	@Override
	public int m1(float a){
		out.println(a);
		return sc.nextInt();
	}
	@Override
	public boolean m2(char c){
		out.println(c);
		return sc.nextBoolean();
	}
	@Override
	public long m4(double l){
		out.println(l);
		return sc.nextLong();
	}
	@Override
	float m6(int a){
		out.println(a);
		return sc.nextFloat();
	}
}

public class J004{
	public static void main(String[]args){
		I1 i1 = new B();
		out.println(i1.m1(I.sc.nextFloat()));
	
		I2 i2 = (B)i1;
		out.println(i2.m2(I.sc.next().charAt(0)));
		
		I i = (B)i2;	
		out.println(I.m3(I.sc.nextLong()));
		out.println(i.m4(I.sc.nextDouble()));
		
		A a = (B)i;
		out.println(a.m5(I.sc.nextBoolean()));
		out.println(a.m6(I.sc.nextInt()));
	}
}