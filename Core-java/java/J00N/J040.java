/*Create a java application where we have one class it contains 2 instance variables 
without values provide user define values for instance variables by using a triple 
parameterized constructor ,we also have a obj parameterized constructor if we call 
the instance variables to the object of the copy constructor we need to get the same
user define values what ever are given to the triple parameterized constructor*/

import java.util.Scanner;
public class J040{
    static Scanner sc = new Scanner(System.in);
	int a;
	int b;
	J040(){
	}
	J040(int a,int b){
		this.a = a;
		this.b = b;
		
	}
	void m1(){
		System.out.println("Hiii");
	}
	static J040 m2(int n){
		System.out.println(n);
		return new J040(sc.nextInt(), sc.nextInt());
	}
	public static void main(String[] args){
	J040 obj = m2(sc.nextInt());
	obj.m1();
	System.out.print(obj.a);
	System.out.print(obj.b);
	}
}