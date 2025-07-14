package Threads;

class MyRun1 implements Runnable {
	@Override
    public void run() {
        for(char i='a';i<='z';i++) {
        	System.out.println(i);
        }
    }
}
class MyRun2 implements Runnable {
	@Override
    public void run() {
        for(char i='A';i<='Z';i++){
        	System.out.println(i);
        }
    }
}

public class SevenThread {
	public static void main(String[] args) {
		Thread newThread1 = new Thread(new MyRun1()); 
		Thread newThread2 = new Thread(new MyRun2()); 
		newThread1.start();
		newThread2.start();
	}
}
