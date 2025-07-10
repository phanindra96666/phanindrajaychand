package P1.sp;
import P1.A;
public interface I3{

	static boolean m10(byte b){

		System.out.println(b);
		return A.sc.nextBoolean();
	}
	
	byte m11(boolean b);
}