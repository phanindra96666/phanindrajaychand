import java.util.Scanner;

class A {
    static Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
}

class B extends A {
   System.out.print(num);
}

class C extends A{
    System.out.print(num);
    int n = 5;
    int b = 6;
}
class D extends C{
    System.out.print(n);
    System.out.print(b);
}
class E extends D{
    System.out.print(n);
    System.out.print(b);
    int e = 10;
}
class G extends E{
    System.out.print(n);
    System.out.print(b);
}

class F extends E{
    System.out.print(n);
    System.out.print(b);
}
class H extends E{
    System.out.print(n);
    System.out.print(b);
}

class Customer extends Retail {
   }
class J004{
    public static void main(String[] args) {
        G obj1 = new G();
	F obj2 = new F();
	H obj3 = new H();
	A obj4 = new A();
    }
}
