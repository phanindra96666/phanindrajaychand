/*Create a Java application where we need to satisfy the super keyword at a variable level (sv.java)
*/

import java.util.Scanner;

class A {
    static Scanner sc = new Scanner(System.in); 
    int n = sc.nextInt(); 
}

class B extends A { 
    void m1(int n) {
        System.out.println(n);
        System.out.print(super.n);     
}
}

class test {
    public static void main(String[] args) {
        B obj = new B();
        obj.m1(B.sc.nextInt()); 
    }
}
