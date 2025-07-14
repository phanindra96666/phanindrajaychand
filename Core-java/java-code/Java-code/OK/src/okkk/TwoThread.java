package Threads;

class MyRunnable implements Runnable {
	@Override
    public void run() {
        for(int i=1;i<=10;i++) {
        	System.out.println(i);
        }
    }
}

public class TwoThread {
	public void run() {
        for(int i=1;i<=10;i++) {
        	System.out.println(i);
        }
    } 
	
	public static void main(String[] args) {
		Thread newThread1 = new Thread(new MyRunnable()); 
		newThread1.start();
	}

}
