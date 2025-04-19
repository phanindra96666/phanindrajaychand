/*create a java application where we need to satisfy both this and super keywords at the variable,method and constructor levels.*/

import java.util.Scanner;

class A {
    static Scanner sc = new Scanner(System.in);  
    int n = sc.nextInt();

    A() {
        System.out.println("A is calling");
    }  

    void m2() {
        System.out.println("A's m2 method is calling");   
    }	
}

class B extends A {
    int n = sc.nextInt();
    B(){
        super();
        System.out.println("B is calling");
    }

    B(int n) {
        this();
        System.out.println(n);
	System.out.print(this.n);
    }

    void m1(int n) {
        System.out.println(n);
        System.out.println(this.n);
        System.out.println(super.n);
    }	

    void m2() {
        this.m1(sc.nextInt());
        super.m2();
    }
}

class Test {
    public static void main(String[] args) {
         B obj = new B(B.sc.nextInt()); 
         obj.m1(B.sc.nextInt()); 
         obj.m2(); 
    }
}
