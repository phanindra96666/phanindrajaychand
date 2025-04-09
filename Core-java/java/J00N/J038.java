/* Create a java application where we need to satficy this keyword and variable level , method level , constructor level in the single program one global and local variable 2 methods */



import java.util.Scanner;
public class J038{
        static Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();//0
	String m1(int a){
		System.out.println(this.a);//0
		System.out.println(a);//10
		return sc.next();//hi
	}
	boolean m2(String s){//hello
		this.m1(sc.nextInt());//10
		System.out.println(s);//hello
		return sc.nextBoolean();//true
	}

	J038(){
		this(sc.nextInt());//69
		System.out.println("Hii");
	}
	J038(int b){//object creation
		System.out.println(b);
	}
	public static void main(String[] args){
		J038 obj = new J038();
		obj.m2(sc.next());//hello
	}
}
