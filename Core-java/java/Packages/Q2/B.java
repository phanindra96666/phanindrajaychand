package P1;
import static java.lang.System.out;

public abstract class B{
	public B(int a){
		out.println(a);
	}
	public abstract boolean m2(char c);
	public long m3(double d){
		out.println(d);
		return A.sc.nextLong();
	}
}

