abstract class A {
    abstract void m1();
    void m2(){
        System.out.println("Hello");
    }
    A(int a){
        System.out.println(a);
    }
}
interface I1 {
    abstract void m3();
    static void m4(){
        System.out.println("Hello");
    }
    public static void main(String[] args) {
        A obj = new A(10){
            @Override
            void m1() {
               System.out.println("Hiii");
            }
        };
        I1 i1=new I1(){
            @Override
            public void m3()
            {
                System.out.println("bye");
            }
        };
        
        obj.m1();
        i1.m3();
        I1.m4();
        obj.m2();
    }
}