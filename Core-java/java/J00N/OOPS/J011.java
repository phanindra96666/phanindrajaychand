/*create a java application where we need to satisfy super keyword at the variable , method and constructor levels. (S.java)*/

import java.util.Scanner;

class A {
    static Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    A(){
        System.out.println("A calling");
    }
    void m1(){	
	System.out.print("M1 is calling");
    }
}
class B extends A {
    B() {
        super();
        System.out.println("B is calling");
    }

    void m1(int n) {
	super.m1();
	System.out.println(n);
        System.out.println(super.n); 
    }
}

class Test {
    public static void main(String[] args) {
        B obj = new B();    
        obj.m1(B.sc.nextInt());          
  }
}
