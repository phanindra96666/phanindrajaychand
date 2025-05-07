/*Create a java application where we have two interfaces with respect to individual 
abstract methods, inherit these interfaces into one more interface which contains one 
abstract method and one defined method, then inherit this interface into an abstract class 
where we have one parameterized constructor, one defined method and one abstract method,
then inherit this class into a concrete class where we need to provide functionality for 
all the abstract methods and invoke all the properties under main by providing dynamic inputs.*/

import java.util.Scanner;
interface A {
    int m1(int n);
}
interface B {
    double m2(String s);
}
interface C extends A,B{
    String m3(Double d);
    default void m4(){
        System.out.println("HI");
    }
}
abstract class D implements C{
    static Scanner sc = new Scanner(System.in);
    D(int n){
        System.out.println(n);
    }
    int m5(String s){
        return sc.nextInt();
    }
    abstract void m6();
}

public class J004 extends D{
    J004() {
        super(sc.nextInt());
    }
    @Override
    public String m3(Double d) {
        return D.sc.next();
    }

    @Override
    public int m1(int n) {
       return D.sc.nextInt();
    }

    @Override
    public double m2(String s) {
       return D.sc.nextDouble();
    }

    @Override
    void m6() {
        
    }
    public static void main(String[] args) {
        J004 obj = new J004();
        obj.m1(D.sc.nextInt());
        obj.m2(D.sc.next());
        obj.m3(D.sc.nextDouble());
        obj.m4();
        obj.m5(D.sc.next());
        obj.m6();
    }
}