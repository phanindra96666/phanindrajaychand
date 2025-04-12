/*create a java application where we have one class it contain two instant variables without values, provide user define values for this instant variables by using double parameterized constructive and print those instance variable under main method by providing dynamic inputs*/

import java.util.Scanner;
public class J039{
    static Scanner sc = new Scanner(System.in);
	int a;
	float b;
	J039(int x,float y){
		this.a = x;
		this.b = y;
		System.out.println(a);
		System.out.print(b);
	}
	public static void main(String[] args){
	J039 obj = new J039(sc.nextInt(),sc.nextFloat());

	}
}
