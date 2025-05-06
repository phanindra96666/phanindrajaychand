import java.util.Scanner;
public class J004 {
    static Scanner sc = new Scanner(System.in);
    int z1(int n){
        return sc.nextInt();
    }
    static int z2(J004 obj){
        obj.z1(sc.nextInt());
        return sc.nextInt();
    }
    static int z3(J004 obj){
        z2(obj);
        return sc.nextInt();
    }
    public static void main(String[] args) {
        z3(new J004());
    }
}
