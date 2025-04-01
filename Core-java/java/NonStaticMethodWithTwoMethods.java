public class NonStaticMethodWithTwoMethods{
    public void m1(int i, String s) {
       System.out.println(i+" "+s);
    }
    public static void m2(double d, long l) {
        System.out.println(d+" "+l);
    }

    public static void main(String[] args) {
        int i = 5;
        String s = "Phani";
        double d = 58.678912;
        long l = 79937;
        NonStaticMethodWithTwoMethods obj = new NonStaticMethodWithTwoMethods();
        obj.m1(i, s);
        m2(d, l);
    }     
}
