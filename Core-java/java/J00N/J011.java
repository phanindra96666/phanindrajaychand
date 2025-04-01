import java.util.Scanner;
public class J011{
    static Scanner in = new Scanner(System.in);
    static J011 obj = new J011();

    public String m1 (int n){
        System.out.println(n);
        return in.next();
    }
    public int m2 (boolean b){
        System.out.println(b);
        return in.nextInt();
    }
    public boolean m3 (double d){
        System.out.println(d);
        return in.nextBoolean();
    }
    public static void main(String[] args) {
      obj.m1(obj.m2(obj.m3(in.nextDouble())));
    }
}
