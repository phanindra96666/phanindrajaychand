package mypackage;
public interface D {
    void methodB();
    default void defaultMethodB() {
        System.out.println("Default method from InterfaceTwo");
    }
}