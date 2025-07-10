package mypackage;
public abstract class B {
    public B(int a) {
        System.out.println("Abstract class constructor: " + a);
    }
    public abstract void display();
    public String greet(String name) {
        return "Hello, " + name;
    }
}