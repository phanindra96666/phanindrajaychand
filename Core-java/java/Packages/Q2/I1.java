package P1;
import static java.lang.System.out;
public interface I1{
	char m4(boolean b);
	static double m5(long l){
		out.println(l);
		return A.sc.nextDouble();
	}
}