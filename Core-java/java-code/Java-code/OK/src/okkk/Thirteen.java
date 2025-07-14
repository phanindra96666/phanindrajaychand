package Threads;
import java.util.Scanner;
public class Thirteen extends Thread {
	static boolean bookingConfirmed = true;
	static final Object lock = new Object();
	
	public void run() {
		synchronized(lock) {
			
			if (bookingConfirmed) {
				bookingConfirmed = ! RedBus.m1();
			} else {
				System.out.println("Booking not allowed");
			}
		}
	}
	
	public static void main(String[] args) {
		Thirteen t1 = new Thirteen();
		Thirteen t2 = new Thirteen();
		Thirteen t3 = new Thirteen();
		t1.start();
		t2.start();
		t3.start();
	}
}

class RedBus{
	static Scanner sc = new Scanner(System.in);
	static synchronized boolean m1() {
		System.out.print("Enter your name: ");
		String s = sc.next();
		System.out.print("Enter age: ");
		int age = sc.nextInt();
		System.out.print("Gender: ");
		String ss = sc.next();
		System.out.print("Price : 600 RS");
		System.out.print("Conform Booking by Entering 1");
		int x = sc.nextInt();
		if(x==1) {
			return true;
		}
		else {
			return false;
		}
	}
}
