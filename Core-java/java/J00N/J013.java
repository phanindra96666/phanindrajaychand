import java.util.Scanner;
public class J013 {
    static J013 obj = new J013();
    public String m1 (int n){
        System.out.println(n);
        return new Scanner(System.in).next();
    }
    public static void main(String[] args) {
      obj.m1(new Scanner(System.in).nextInt());
    }
}
