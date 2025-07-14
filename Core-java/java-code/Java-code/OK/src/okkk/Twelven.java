package Threads;

public class Twelven extends Thread {
	public void run() {
		A x = new A();
		x.m1();
	}
	public static void main(String[] args) {
		Twelven t1 = new Twelven();
		Twelven t2 = new Twelven();
		t1.start();
		t2.start();
	}
}
class A{
	static synchronized void m1() {
		for(int i=1;i<=10;i++) {
			System.out.print(i);
			System.out.println();
		}
	}
}
