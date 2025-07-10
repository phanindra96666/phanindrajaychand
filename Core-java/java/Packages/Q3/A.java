package P1;
import java.util.Scanner;
import static java.lang.System.out;

public class A{
	public static Scanner sc = new Scanner(System.in);
	public A(String s){
		out.println(s);
	}
	public static int m1(float a){
		out.println(a);
		return sc.nextInt();
	}	
	public float m2(int a){
		out.println(a);
		return sc.nextFloat();
	}
}