public class J019 {
    void display(int a) {
        System.out.println("Integer: " + a);
    }

    void display(String a) {
        System.out.println("String: " + a);
    }

    void display(double a, int b) {
        System.out.println("Double and Integer: " + a + ", " + b);
    }

    public static void main(String[] args) {
        J019 obj = new J019();
        obj.display(10);
        obj.display("Hello");
        obj.display(5.5, 2);
    }
}
