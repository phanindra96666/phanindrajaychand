package Threads;
import java.util.Scanner;

class MyRun111 implements Runnable {
	@Override
    public void run() {
        for(char i='a';i<='z';i++) {
        	System.out.println(i);
        }
    }
}
class MyRun222 implements Runnable {
	@Override
    public void run() {
        for(char i='A';i<='Z';i++){
        	System.out.println(i);
        }
    }
}
public class Ten {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) throws InterruptedException {
		MyRun111 obj1 = new MyRun111();
		MyRun222 obj2 = new MyRun222();
		
		Thread t1 = Thread.currentThread();
		Thread newThread1 = new Thread(obj1);
		Thread newThread2 = new Thread(obj2);
		
		System.out.print(t1.isAlive());
		newThread1.setPriority(Thread.MIN_PRIORITY);
		newThread2.setPriority(Thread.MAX_PRIORITY);
			
		newThread1.start();
		newThread2.start();
		sc.close();
	}
}