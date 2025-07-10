package P2;
import P1.*;
import static java.lang.System.out;

public class Test extends B implements I1,I2{
	Test(){
		super(A.sc.nextInt());
	}

	@Override
	public boolean m2(char c){
		out.println(c);
		return A.sc.nextBoolean();
	}

	@Override
	public char m4(boolean b){
		out.println(b);
		return A.sc.next().charAt(0);
	}
	
	@Override
	public String m6(byte b){
		out.println(b);
		return A.sc.next();
	}
	
	public static void main(String[]args){
		A obj = new A();
		new A(A.sc.next());
		out.println(obj.a);
		out.println(A.m1(A.sc.nextFloat()));
		
		B b = new Test();
		out.println(b.m2(A.sc.next().charAt(0)));
		out.println(b.m3(A.sc.nextDouble()));
		
		I1 i1 = (Test)b;
		out.println(i1.m4(A.sc.nextBoolean()));
		out.println(I1.m5(A.sc.nextLong()));

		I2 i2 = (Test)i1;
		out.println(i2.m6(A.sc.nextByte()));
		out.println(i2.m7(A.sc.nextInt()));
	}
}