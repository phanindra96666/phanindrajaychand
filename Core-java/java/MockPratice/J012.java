class A {
    static B obj1 = new B();
    static A obj = new A();
    void m1() {
        System.out.println("Hi from A");
    }
}

class B {
    void m2(int n) {
        System.out.println("Number from B: " + n);
    }
}

public class J012{
    public static void main(String[] args) {
        A.obj1.m2(8);
        A.obj.m1();
    }
}

//System.out.println("Hii");