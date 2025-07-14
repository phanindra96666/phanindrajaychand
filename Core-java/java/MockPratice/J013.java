public class J013 {

    J013(int n) {
       
    }

    public static int m1(int n) {
        System.out.print("hII ");
        return 10;
    }

    public int m2(int n) {
        return 10;
    }

    public int m3(int n) {
        return n;
    }

    public static void main(String[] args) {
        new J013(m1(10)).m2(new J013(m1(10)).m3(10));
    }
}
