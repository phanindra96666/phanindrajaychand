import java.util.Scanner;
public class J010 {
    static Scanner in = new Scanner(System.in);
    static J010 obj = new J010();
    public int m1 (String s){
        System.out.print(s);
        return in.nextInt();
    }
    public String m2 (boolean b){
        System.out.print(b);
        return in.next();
    }
    public static void main(String[] args) {
      obj.m1(obj.m2(in.nextBoolean()));
    }
}
