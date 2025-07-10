package P1;
public abstract class B{

	public B(String s){
		System.out.println(s);
	}

	public abstract byte m3(char ch);

	public boolean m4(float f){

		System.out.println(f);
		return A.sc.nextBoolean();
	}
}