/*6.Create a Java Application where we have one static variable integer, two non-static variables Boolean and double, one non static method with parameter char and returns long value, a default constructor and a parameterized constructor. then invoke all the properties under main by providing dynamic inputs.  
*/


import java.util.Scanner;
public class J030{  
	static Scanner in = new Scanner(System.in);
	static int a = in.nextInt();
	boolean b = in.nextBoolean();
	double d = in.nextDouble();

	public long m1(char c) {
        	System.out.println("m1 calling");
               	return in.nextLong();
    	}

	J030(){
		System.out.print("Default");
	}

	J030(int a , String s){
		System.out.println(a+" "+s);
	}

	public static void main(String[] args){ 
		J030 obj = new J030();
		J030 obj2 = new J030(in.nextInt(),in.next());
		obj.m1(in.next().charAt(0));
		obj.b;
		obj.d;


	}
}
