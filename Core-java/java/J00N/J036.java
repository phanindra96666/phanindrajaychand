/*
Create a java application where we have one class it contains constructors like a single parameter as Integer, default, double parameter as String and boolean, and Tripple parameter like double long and character. then invoke a single parameter under default, default under double parameter, and double under Tripple and Tripple under main by using this keyword with dynamic inputs. (Z.java)
*/
import java.util.Scanner;
public class J036{
        static Scanner sc = new Scanner(System.in);
	J036 (){
		this(sc.nextInt());
	}

	J036 (int a){
		System.out.print(a);
	}

	J036 (String s, boolean b){
		this();
		System.out.print(s);
		System.out.print(b);
	}

	J036 (double d, long l, char c){
		this(sc.next(),sc.nextBoolean());
		System.out.print(d);
		System.out.print(l);
		System.out.print(c);

	}

	public static void main(String[] args){
		J036 obj = new J036(sc.nextDouble(),sc.nextLong(),sc.next().charAt(0));
	}
}
