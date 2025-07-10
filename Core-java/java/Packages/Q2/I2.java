package P1;
import static java.lang.System.out;
public interface I2{
	String m6(byte b);
	default short m7(int i){
		out.println(i);
		return A.sc.nextShort();
	}
}