package P3;
import P1.*;
import static java.lang.System.out;

public class Test2{
	public static void main(String[]args){
		A obj = new A();
		A obj1 = new A(A.sc.next());
		out.println(obj.a);
		out.println(A.m1(A.sc.nextFloat()));
		
		B b = new B(A.sc.nextInt()){
			@Override
			public boolean m2(char c){
				out.println(c);
				return A.sc.nextBoolean();
			}
		};
		out.println(b.m2(A.sc.next().charAt(0)));
		out.println(b.m3(A.sc.nextDouble()));
		
		I1 i1 = (b)->{
			out.println(b);
			return A.sc.next().charAt(0);
		};
		out.println(i1.m4(A.sc.nextBoolean()));
		out.println(I1.m5(A.sc.nextLong()));
		
		I2 i2 = (b)->{
			out.println(b);
			return A.sc.next();
		};
		out.println(i2.m6(A.sc.nextByte()));
		out.println(i2.m7(A.sc.nextInt()));	
	}
}