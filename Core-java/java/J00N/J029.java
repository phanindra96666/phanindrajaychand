/*5.Create a java app where we have one class, it contains a default constructor, double parameterized constructor, Tripple parameterized constructor, methods like m1, m2, and m3 with parameters and return types then invoke all constructors under main by providing dynamic inputs, invoke m1 under default constructor, m2 under double parameterized constructor and m3 under Tripple parameterized constructor by giving dynamic inputs. (D.java)
*/

import java.util.Scanner;
public class J029{
	static Scanner in = new Scanner(System.in);

	public int m1(double d) {
        	System.out.println("m1 calling");
               	return in.nextInt();
    	}

    	public String m2(float n) {
        	System.out.println("m2 calling");
               	return in.next();
    	}

    	public char m3(String S) {
        	System.out.println("m3 calling");
               	return in.next().charAt(0);  
    	}

	J029(){
		System.out.print("Default");
		m1(in.nextDouble());
	}
	J029(int a , String s){
		System.out.println(a+" "+s);
		m2(in.nextFloat());
	}

	J029(int a,String s,boolean b){
		System.out.print(a+" "+s+" "+b);
		m3(in.next());
	}

	public static void main(String[] args){ 
		J029 obj = new J029();
		J029 obj2 = new J029(in.nextInt(),in.next());
		J029 obj3 = new J029(in.nextInt(),in.next(),in.nextBoolean());
	}
}
