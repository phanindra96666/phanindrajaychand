package mypackage;
public interface C {
    void methodA();
    default void defaultMethodA() {
        System.out.println("Default method from InterfaceOne");
    }
}