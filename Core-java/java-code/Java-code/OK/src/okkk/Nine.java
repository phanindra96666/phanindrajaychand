package Threads;
import java.util.Scanner;
public class Nine extends MyClass implements Runnable {
	
    public void run() {
        System.out.println("Hello");
    }
    
    public static void main(String[] args) {
        Nine obj = new Nine();
        Thread t = new Thread(obj);
        t.start();
        System.out.println("m1 output: " + obj.m1(MyClass.sc.nextInt()));
        System.out.println("m2 output: " + obj.m2(MyClass.sc.next()));
    }
} 

class MyClass {
	static Scanner sc = new Scanner(System.in);
    public int m1(int x) {
        return sc.nextInt();
    }

    public String m2(String s) {
        return sc.next();
    }
}

