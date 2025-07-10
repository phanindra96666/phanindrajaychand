package P2;
import P1.*;
import P1.sp.*;

public class Test extends B implements I1,I2,I3{

	public Test(String s){
		super(s);
	}

	public byte m3(char ch){

		System.out.println(ch);
		return A.sc.nextByte();
	}

	public int m6(String s){

		System.out.println(s);
		return A.sc.nextInt();
	}
	
	public String m9(int a){

		System.out.println(a);
		return A.sc.next();
	}

	public byte m11(boolean b){

		System.out.println(b);
		return A.sc.nextByte();
	}

	public static void main(String []args){
	
		A obj = new A(A.sc.next());
		System.out.println(A.m1(A.sc.nextFloat()));
		System.out.println(obj.m2(A.sc.nextInt()));
		
		Test obj2 = new Test(A.sc.next());
		System.out.println(obj2.m3(A.sc.next().charAt(0)));
		System.out.println(obj2.m4(A.sc.nextFloat()));
	
		System.out.println(obj2.m6(A.sc.next()));
		System.out.println(I1.m7(A.sc.nextInt()));

		System.out.println(obj2.m8(A.sc.next()));
		System.out.println(obj2.m9(A.sc.nextInt()));

		System.out.println(I3.m10(A.sc.nextByte()));
		System.out.println(obj2.m11(A.sc.nextBoolean()));
		
	}
}