import java.util.Scanner;
public class J009 {
    static Scanner in = new Scanner(System.in);
    static J009 obj = new J009();
    public int m1 (boolean f){
        System.out.print(f);
        return in.nextInt();
    }
    public int m2 (char c){
        System.out.print(c);
        return obj.m1(in.nextBoolean());
    }
    public int m3 (double c){
        System.out.print(c);
        return obj.m2(in.next().charAt(0));
    }
    public static void main(String[] args) {
       System.out.println(obj.m3(in.nextDouble()));
    }
}
