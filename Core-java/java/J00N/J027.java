/*3.Create a Java Application where we have one class, it contains a default constructor, Single parameterized constructor, double parameterized constructor, and Tripple parameterized constructor. invoke all these constructors under the main by giving dynamic inputs. (C.java)
*/

import java.util.Scanner;
public class J027{
	J027(){
		System.out.print("Default");
	}
	J027(int a){
		System.out.println(a);
	}
	J027(int a , String s){
		System.out.println(a+" "+s);
	}

	J027(int a , String s,boolean b){
		System.out.print(a+" "+s+" "+b);
	}

	public static void main(String[] args){ 
		Scanner in = new Scanner(System.in);
		J027 obj = new J027();
		J027 obj1 = new J027(in.nextInt());
		J027 obj2 = new J027(in.nextInt(),in.next());
		J027 obj3 = new J027(in.nextInt(),in.next(),in.nextBoolean());
	}
}
