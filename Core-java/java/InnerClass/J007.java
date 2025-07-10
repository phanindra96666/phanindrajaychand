interface I1 {
    void m1();
    static void m2(){
        System.out.println("Hello");
    }
    interface I2 {
        void m3();
    }
    interface I3 {
        void m4();
    }
}
public class J007{
    public static void main(String[] args) {
        
    I1 obj = new I1(){
        @Override
        public void m1() {
            System.out.println("Hii");
        }
    };
    I1.I2 obj1 = new I1.I2(){
        @Override
        public void m3() {
            System.out.println("Hii");
        };
    };

    I1.I3 obj2 = new I1.I3() {
        @Override
        public void m4() {
            System.out.println("Hiii");
        };
    };
    obj.m1();
    I1.m2();
    obj1.m3();
    obj2.m4();

    }
}