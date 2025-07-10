package mainpackage;
import mypackage.*;
import java.util.Scanner;
public class F extends B implements C, D {

    public F(int a) {
        super(a);
    }

    @Override
    public void display() {
        System.out.println("Implemented abstract method from AbstractClass");
    }

    @Override
    public void methodA() {
        System.out.println("Implemented methodA from InterfaceOne");
    }

    @Override
    public void methodB() {
        System.out.println("Implemented methodB from InterfaceTwo");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a value for ConcreteClass: ");
        int val = scanner.nextInt();

        A obj = new A(val);
        System.out.println("Non-static variable value: " + obj.value);
        System.out.println("Static method output (square): " + A.square(obj.value));

        F mainObj = new F(val);
        System.out.println(mainObj.greet("User"));
        mainObj.display();
        mainObj.methodA();
        mainObj.defaultMethodA();
        mainObj.methodB();
        mainObj.defaultMethodB();
        scanner.close();
    }
}
