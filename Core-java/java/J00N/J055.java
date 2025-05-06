import java.util.Scanner;
public class J055 {
    static Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();//5
    J055(int n){
        System.out.println(n);
        System.out.println(this.n+"gobal");
    }
    void m1(){
        System.out.println("hII");
    }
    void m2(){
        this.m1();
        System.out.println("hII");
    }
    J055(){
        this(sc.nextInt());//10
        System.out.println("J005 is calling");
    }

}
class kk extends J055{
    int n = J055.sc.nextInt();
    kk(int n){
        System.out.println(n);
        System.out.println(this.n);
        System.out.println(super.n);
    }
    kk(){

    }
    void m1() {
        System.out.println("Hiii");
    }
    void m2(){
        this.m1();
        super.m1();
    }
    public static void main(String[] args) {
        kk obj1 = new kk();
        obj1.m2();
    }
}
