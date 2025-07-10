package P1.sp;
public interface I2
{
	default int m8(String s){
		System.out.println(s);
		return P1.A.sc.nextInt();
	}
	String m9(int a);	
}