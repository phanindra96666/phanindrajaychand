class MyRun implements Runnable {
	@Override
    public void run() {
        for(int i=5;i>=1;i--) {
        	System.out.println(i);
        	try { 
				Thread.sleep(3000);
			} 

			catch (InterruptedException e) {
				e.printStackTrace();
			}
        }
    }
}

public class FourThread {
	public void run() {
        for(int i=1;i<=10;i++) {
        	System.out.println(i);
        }
    } 
	
	public static void main(String[] args) {
		Thread newThread1 = new Thread(new MyRun()); 
		newThread1.start();
	}

}
