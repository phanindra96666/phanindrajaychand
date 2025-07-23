package Threads;

public class OneThread {
    public static void main(String[] args) {
        
        Thread current1 = Thread.currentThread();
        Thread current2 = Thread.currentThread();
        Thread current3 = Thread.currentThread();

        
        Thread newThread1 = new Thread();
        Thread newThread2 = new Thread();
        Thread newThread3 = new Thread();

    
        System.out.println("Default Thread Names:");
        System.out.println(); 
        System.out.println("Current Thread 1: " + current1.getName());
        System.out.println("Current Thread 2: " + current2.getName());
        System.out.println("Current Thread 3: " + current3.getName());
        System.out.println("New Thread 1: " + newThread1.getName());
        System.out.println("New Thread 2: " + newThread2.getName());
        System.out.println("New Thread 3: " + newThread3.getName());
        System.out.println();
     
        current1.setName("MainThread");
        current2.setName("WorkerThread-1");
        current3.setName("WorkerThread-2");
        newThread1.setName("NewThread-A");
        newThread2.setName("NewThread-B");
        newThread3.setName("NewThread-C");

        
        System.out.println("\nUser-Friendly Thread Names:");
        System.out.println();
        System.out.println("Current Thread 1: " + current1.getName());
        System.out.println("Current Thread 2: " + current2.getName());
        System.out.println("Current Thread 3: " + current3.getName());
        System.out.println("New Thread 1: " + newThread1.getName());
        System.out.println("New Thread 2: " + newThread2.getName());
        System.out.println("New Thread 3: " + newThread3.getName());
    }
}
