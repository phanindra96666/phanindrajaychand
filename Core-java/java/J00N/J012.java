public class J012{
    static java.util.Scanner in = new java.util.Scanner(System.in);
    static J012 obj = new J012();

    public String m1 (int n){
        System.out.println(n);
        return in.next();
    }
    public static void main(String[] args) {
      obj.m1(in.nextInt());
    }
}
