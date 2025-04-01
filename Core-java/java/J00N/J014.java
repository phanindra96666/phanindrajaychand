import java.util.Scanner;
public class J014{
    static Scanner in = new Scanner(System.in);
   
    public boolean m1 (int n){
        System.out.println(n);
        return in.nextBoolean();
    }
    public double m2 (String s){
        System.out.println(s);
        return in.nextDouble();
    }
    public static void main(String[] args) {
        new J014().m1(in.nextInt());
        new J014().m2(in.next());
    }
}