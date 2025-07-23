package Threads;

class MyRunnabl1 implements Runnable {
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
class MyRunnabl2 implements Runnable {
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

class MyRunnabl3 implements Runnable {
	@Override
    public void run() {
        for(int i=11;i<=20;i++) {
        	System.out.println(i);
//        	try {
//        	    Thread.sleep(1000);
//        	} catch (InterruptedException ex) {
//        	    ex.printStackTrace(); 
//        	}
        }
    }
}

public class SixThread {
	public static void main(String[] args) throws InterruptedException {
		Thread newThread1 = new Thread(new MyRunnabl1()); 
		Thread newThread2 = new Thread(new MyRunnabl2()); 
		Thread newThread3 = new Thread(new MyRunnabl3()); 
		
		 try {
	            newThread1.start();
	            newThread1.join();

	            newThread2.start();
	            newThread2.join();

	            newThread3.start();
	            newThread3.join();
	        } 
		 
		 catch (InterruptedException e) {
	            e.printStackTrace();
	        }

	}

}
