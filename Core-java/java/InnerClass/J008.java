import java.util.Scanner;
public class J008 {
    static Scanner sc = new Scanner(System.in);
    J008(int n){
        System.out.println(n);
    }
    public static int m1(int n){
        System.out.println(n);
        return sc.nextInt();
    }
    interface I1 {
        void m2();
        static void m3(){
            System.out.println("Hello");
        }
        static void m4(){
            System.out.println("Hello");
        }
    }
    public static void main(String[] args) {
        J008 obj1 = new J008(10);
        I1 obj = new I1() {
            @Override
            public void m2(){
                System.out.println("Hello");
            }
        };
        System.out.println(m1(6));
        obj.m2();
        J008.I1.m3();
        J008.I1.m4();
    }
    
}
