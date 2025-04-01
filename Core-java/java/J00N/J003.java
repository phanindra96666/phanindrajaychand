public class J003 {

    public static void m1() {
        System.out.println("Static method with no return type and no parameters");
    }

    public static int m5() {
        System.out.println("Static method with a return type and no parameters");
        return 42;  
    }
    
    public static void m3(String s) {
        System.out.println("Static method with no return type and one parameter");
        System.out.println(s);
    }

    public static int m7(String s) {
        System.out.println("Static method with a return type and one parameter");
        System.out.println(s);
        return s.length();  
    }

    public void m2() {
        System.out.println("Instance method with no return type and no parameters");
    }

    public void m4(int n) {
        System.out.println("Instance method with no return type and one parameter");
        System.out.println(n);
    }

    public String m6() {
        System.out.println("Instance method with a return type and no parameters");
        return "Hello from instance method!";
    }


    public double m8(double d) {
        System.out.println("Instance method with a return type and one parameter");
        return d * 2;  
    }

    //Main method
    public static void main(String[] args) {
        m1();
        J003 obj = new J003();
        obj.m2();  
        m3("Hello from static method m3");
        obj.m4(100);
        int result5 = m5();
        System.out.println("Returned value from m5: " + result5);
        String result6 = obj.m6();
        System.out.println("Returned value from m6: " + result6);
        int result7 = m7("Java Programming");
        System.out.println("Returned value from m7 (String length): " + result7);
        double result8 = obj.m8(5.5);
        System.out.println("Returned value from m8 (double * 2): " + result8);
    }
}