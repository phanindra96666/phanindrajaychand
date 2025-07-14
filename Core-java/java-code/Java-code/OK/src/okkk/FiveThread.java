package Threads;

class MyRunnable1 implements Runnable {
	@Override
    public void run() {
        for(int i=1;i<=10;i++) {
        	System.out.println(i);
        	try {
        	    Thread.sleep(1000);
        	} catch (InterruptedException ex) {
        	    ex.printStackTrace(); 
        	}
        }
    }
}
class MyRunnable2 implements Runnable {
	@Override
    public void run() {
        for(int i=10;i>=1;i--) {
        	System.out.println(i);
        	try {
        	    Thread.sleep(1000);
        	} catch (InterruptedException ex) {
        	    ex.printStackTrace(); 
        	}
        }
    }
}

public class FiveThread {
	public static void main(String[] args) {
		Thread newThread1 = new Thread(new MyRunnable1()); 
		Thread newThread2 = new Thread(new MyRunnable2()); 
		newThread1.start();
		newThread2.start();
	}

}
