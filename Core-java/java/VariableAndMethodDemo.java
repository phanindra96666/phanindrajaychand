public class VariableAndMethodDemo {
    static int staticVariable = 10;
    int nonStaticVariable = 20;
    public static void staticMethod() {
        System.out.println("This is a static method.");
        System.out.println("Static variable value: " + staticVariable);
    }
    public void nonStaticMethod(int value) {
        System.out.println("This is a non-static method.");
        System.out.println("Non-static variable value: " + nonStaticVariable);
        System.out.println("Parameter passed: " + value);
    }

    public static void main(String[] args) {
        staticMethod();
        VariableAndMethodDemo obj = new VariableAndMethodDemo();
        obj.nonStaticMethod(42);
        System.out.println("Static variable value: " + staticVariable);
        System.out.println("Non-static variable value: " + obj.nonStaticVariable);
    }
}