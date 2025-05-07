/*Create a java application where we have three interfaces with one abstract method each, 
inherit all these interfaces at a time into a concrete class to provide functionality for 
abstract methods and invoke all the methods under main by providing dynamic inputs.
*/
import java.util.Scanner;
interface A {
    int m1(int n);
}
interface B {
    double m2(String s);
}
interface C {
   String m3();
}

class D implements A,B,C{
    static Scanner sc = new Scanner(System.in);
    @Override
    public int m1(int n){
        return sc.nextInt();
    }
    public double m2(String s){
        return sc.nextDouble();
    }
    public String m3(){
        return sc.next();
    }
}
public class J003 {
    public static void main(String[] args) {
        D obj = new D();
        obj.m1(D.sc.nextInt());
        obj.m2(D.sc.next());
        obj.m3();
    }
}