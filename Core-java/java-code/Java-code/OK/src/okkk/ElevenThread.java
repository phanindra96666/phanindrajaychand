package okkk;

class MyRunnbl1 implements Runnable {
    @Override
    public void run() {
        printNumbers();
    }

    public static synchronized void printNumbers() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }
}

public class ElevenThread {
    public static void main(String[] args) {
        Thread newThread1 = new Thread(new MyRunnbl1());
        Thread newThread2 = new Thread(new MyRunnbl1());

        newThread1.start();
        newThread2.start();
    }
}
