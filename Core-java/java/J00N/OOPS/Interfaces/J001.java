/*Create a java application where we have one interface which contains two abstract methods, 
inherit this interface into one concrete class to provide functionality for abstract methods, 
and invoke these methods under main by providing dynamic inputs.*/
import java.util.Scanner;
interface A {
    int m1(int n);//public,abstract
    double m2(String s);
}
class B implements A {
    static Scanner sc = new Scanner(System.in);
    @Override
    public int m1(int n){
        System.out.println(n);
        return sc.nextInt();
    }
    @Override
    public double m2(String s){
        System.out.println(s);
        return sc.nextDouble();
    }
}
public class J001 {
    public static void main(String[] args) {
        B obj = new B();
        obj.m1(B.sc.nextInt());
        obj.m2(B.sc.next());
    }
}
