/*
create java application where we have one class it contains three methods m1 has a parameter integer and it is going to returns a String value, method m2 having parameter float and it is going to return boolean value and method m3 having parameter string and it is going to return double value then invoke m3 under main method, m2 under m3 and m1 under m2 by using this keyword with dynamic inputs. (this.java)

*/
import java.util.Scanner;
public class J035{
        static Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	String m1(int a){
		System.out.print(this.a);
		System.out.print(a);
		return sc.next();
	}
	boolean m2(float f){
		this.m1(sc.nextInt());
		System.out.print(f);
		return sc.nextBoolean();
	}
	 double m3(String s){
		this.m2(sc.nextFloat());
		System.out.print(s);
		return sc.nextDouble();
	}

	public static void main(String[] args){
		J035 obj = new J035();
		obj.m3(sc.next());
	}
}
