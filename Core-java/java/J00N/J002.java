import java.util.Scanner;
public class J002 {
    public String m1(int a , boolean b , double c){
        Scanner in = new Scanner(System.in);
        String S = in.next();
        in.close();
        return S;
    }
    public static void main(String[] args) {
        J002 obj = new J002();
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        boolean b = in.nextBoolean();
        double c = in.nextDouble();
        obj.m1(a, b, c);
        in.close();
    }
}
