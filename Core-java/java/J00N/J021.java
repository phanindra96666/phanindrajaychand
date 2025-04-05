import java.util.Scanner;
public class J021 {
	static Scanner in = new Scanner(System.in);
	int m1(String s){
	     System.out.println(s);
	     return in.nextInt();
	}
	static String m2(J021 obj){
	    obj.m1(in.next());
	    return in.next();
	}
	static boolean m3(J021 obj){
	    m2(obj);
	    return in.nextBoolean();
	}

     public static void main(String[] args){
	m3(new J021());
	
     }
}