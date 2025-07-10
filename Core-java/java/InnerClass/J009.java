interface I1 {
    void m1();
    static void m2(){
        System.out.println("Hello");
    }
    class c1 {
        void m3(){
            System.out.println("Hello");
        }
    }
    class c2 {
        static void m4(){
            System.out.println("Hello");
        }
    }
}
public class J009 {
    public static void main(String[] args) {
        I1 obj = new I1() {
            @Override 
            public void m1(){
                System.out.println("Hii");
            }
        };
        obj.m1();
        I1.m2();
        I1.c1 c1 = new I1.c1();
        c1.m3();
        I1.c2.m4();
    }
}