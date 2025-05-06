/*7 Create a java application where we need to create any two constructors and then 
invoke any one constructor under the main method from there it has to invoke the 
remaining constructor. (E.java)*/

import java.util.Scanner;
public class J031{
	static Scanner in = new Scanner(System.in);
	int a = in.nextInt();
	J031(){
		System.out.println("Default");
	}

	J031(int a , String s){
		J031 obj = new J031();
		System.out.println(a+" "+s);
	}

	public static void main(String[] args){ 
		J031 obj2 = new J031(in.nextInt(),in.next());
	}
}
