import java.util.Scanner;

public class J020 {
    public static Scanner m1(){
        return new Scanner(System.in);
    }
    public static void m2(int a){
        System.out.println(a);
    }
    public static void main(String[] args) {
        m2(m1().nextInt());
    }
}
