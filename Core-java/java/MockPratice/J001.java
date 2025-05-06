import java.util.Scanner;
public class J001 {
    static Scanner sc = new Scanner(System.in);
    static int m1(int n){
        return n;
    }
    int m2(int n){
        return n;
    }
    static void m3(int n,int a){
        System.out.println(n+" "+a);
    }
    public static void main(String[] args){
        J001 obj = new J001();
        m3(m1(sc.nextInt()),obj.m2(sc.nextInt()));
    }
}