/*Create a java application where we have two interfaces with respect to individual 
abstract methods, one abstract class which contains one parameterized constructor, 
one defined method, and one abstract method, we also have one concrete class which 
contains one defined method, then inherit all the templates into one concrete class
to provide functionality for abstract methods and invoke all the methods under main
by providing dynamic inputs.*/


import java.util.Scanner;
interface A {
    int m1(int n);
}
interface B {
    double m2(String s);
}

abstract class C implements A,B{
    static Scanner sc = new Scanner(System.in);
    C(int n){
        System.out.println(n);
    }
    int m3(String s){
        return sc.nextInt();
    }
    abstract void m4(long l);
}
class D extends C{
    D() {
        super(sc.nextInt());
    }
    @Override
    public int m1(int n) {
        return sc.nextInt();
    }

    @Override
    public double m2(String s) {
        return sc.nextDouble();
    }

    @Override
    void m4(long l) {
        System.out.println("Hello");
    }
}
class E extends D{
    double m5(float f){
        return sc.nextDouble();
    }
}
public class J005 {
    public static void main(String[] args) {
        E obj = new E();
        obj.m1(E.sc.nextInt());
        obj.m2(E.sc.next());
        obj.m3(E.sc.next());
        obj.m4(E.sc.nextLong());
        obj.m5(E.sc.nextFloat());   
    }
}
