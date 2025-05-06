abstract class A {
    A(String name) {
        System.out.println(name);
    }
    
    public abstract void add(int a,int b);
    public abstract void sub(int a,int b);
    public abstract void mul(int a,int b);
}

class B extends A {
    B(String name) {
        super(name);
        System.out.println(name);
    }

    @Override
    public void add(int a,int b) {
        System.out.println(a+b);
    }

    @Override
    public void sub(int a,int b) {
        System.out.println(a-b);
    }

    @Override
    public void mul(int a,int b) {
        System.out.println(a*b);
    }
}

class C extends A {
    C(String name) {
        super(name);
        System.out.println(name);
    }

    @Override
    public void add(int a,int b) {
        System.out.println(a+a+b+b);
    }

    @Override
    public void sub(int a,int b) {
        System.out.println(a-a-b-b);
    }

    @Override
    public void mul(int a,int b) {
        System.out.println(a*a*b*b);
    }
}

class D extends A {
    D(String name) {
        super(name);
        System.out.println(name);
    }

    @Override
    public void add(int a,int b) {
        System.out.println(a+b+a+b);
    }

    @Override
    public void sub(int a,int b) {
        System.out.println(b-a-b-a);
    }

    @Override
    public void mul(int a,int b) {
        System.out.println(b*a*a);
    }
}

public class J007 {
    public static A display(A obj) {
        obj.add(5,5);
        obj.sub(5,5);
        obj.mul(5,5);
        return obj;
    }
    public static void main(String[] args) {
        B obj1 = new B("hello");
        C obj2 = new C("Hii");
        D obj3 = new D("Hello hi");
        display(obj1);
        display(obj2);
        display(obj3);
    }
}