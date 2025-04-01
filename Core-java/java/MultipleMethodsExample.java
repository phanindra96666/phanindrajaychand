public class MultipleMethodsExample {
    static void m1(String str) {
        System.out.println("String value: " + str);
    }
    static void m2(Integer num) {
        System.out.println("Integer value: " + num);
    }
    public static void main(String[] args) {
        m1("Hello from m1!");
        m2(100);
    }
}
