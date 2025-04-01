import java.util.Scanner;
public class J004 {
    static Scanner in = new Scanner(System.in);
    public char m1(boolean a){
        System.out.print("return int");
        System.out.println();
        m2(in.nextDouble());
        return in.next().charAt(0);
    }
    public short m2(double s){
        System.out.println();
        return in.nextShort();
        
    } 
    public static void main(String[] args) {
        J004 obj = new J004();
        System.out.println(obj.m1(in.nextBoolean()));
    }
}
