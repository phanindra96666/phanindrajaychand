package Threads;
import java.util.Scanner;
class c1{
	public float m1(String s) {
		System.out.println(s);
		return ThreeThread.sc.nextFloat();
	}
}
class c2{
	public long m2(boolean b) {
		System.out.println(b);
		return ThreeThread.sc.nextLong();
	}
}
class MYRunnable implements Runnable{
	@Override
	public void run() {
		c1 obj1 = new c1();
		c2 obj2 = new c2();
		try {
		    obj1.m1(ThreeThread.sc.next());
		    obj2.m2(ThreeThread.sc.nextBoolean());
		} 
		catch (Exception e) {
		    System.out.print("Invalid input: " );
		    e.printStackTrace();
		}

	}
}
public class ThreeThread{ 
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		Thread t1 = new Thread(new MYRunnable());
		t1.start();
	}
}
