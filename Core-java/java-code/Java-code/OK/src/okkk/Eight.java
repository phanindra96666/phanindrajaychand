package okkk;
import java.util.Scanner;

class MyRun11 implements Runnable {
	@Override
    public void run() {
        for(char i='a';i<='z';i++) {
        	System.out.println(i);
        }
    }
}
class MyRun22 implements Runnable {
	@Override
    public void run() {
        for(char i='A';i<='Z';i++){
        	System.out.println(i);
        }
    }
}
public class Eight {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) throws InterruptedException {
		MyRun11 obj1 = new MyRun11();
		MyRun22 obj2 = new MyRun22();
		
		Thread t1 = Thread.currentThread();
		Thread t2 = Thread.currentThread();
		
		Thread newThread1 = new Thread(obj1);
		Thread newThread2 = new Thread(obj2);
		
		newThread1.start();
		newThread1.join();
		newThread2.start();
		
		
		System.out.println("Thread state: " + t1.isAlive());
		System.out.println("Thread state: " + t2.isAlive());
		System.out.println("Thread state: " + newThread1.isAlive());
		System.out.println("Thread state: " + newThread2.isAlive());
		
	}

}



