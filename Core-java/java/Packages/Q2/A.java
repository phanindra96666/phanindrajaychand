package P1;
import java.util.Scanner;
import static java.lang.System.out;

public class A{
	public static Scanner sc = new Scanner(System.in);
	public int a = sc.nextInt();
	public A(){
		out.println("Default Constructor of A");
	}
	public A(String s){
		out.println(s);	
	}
	public static int m1(float a){
		out.println(a);
		return sc.nextInt();	
	}
}