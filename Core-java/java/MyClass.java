public class MyClass {
    public void methodOne(int num) {
        System.out.println("Non-static method with integer parameter: " + num);
    }
    public static void methodTwo() {
        System.out.println("Static method with no parameters");
    }
    public void methodThree(double d, long l) {
        System.out.println("Non-static method with double and long parameters: " + d + ", " + l);
    }
    public static void methodFour(float f, boolean b, int i) {
        System.out.println("Static method with float, boolean, and int parameters: " + f + ", " + b + ", " + i);
    }
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.methodOne(42);
        methodTwo();
        obj.methodThree(10.5, 100000L); 
        methodFour(3.14f, true, 7);
    }
}
