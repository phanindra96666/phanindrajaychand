/*
create a Java application where we need to satisfy this keyword at a variable level.(example.java)
*/

import java.util.Scanner;
public class J034{
    static Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	J034(int a){
	   System.out.println(a);
	   System.out.print(this.a);
	}

	public static void main(String[] args){
		J034 obj = new J034(sc.nextInt());
	}
}
