/*2.Create a Java Application, where we have one class, it contains one parameterized constructor, a parameter like String then it has to print the value of the string while we invoke this under main by providing dynamic inputs (B.java)
*/
import java.util.Scanner;
public class J026{
	J026(String s){
		System.out.print(s);
	}
	public static void main(String[] args){ 
		Scanner in = new Scanner(System.in);
		J026 obj = new J026(in.next());
	}
}
