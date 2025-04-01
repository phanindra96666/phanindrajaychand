import java.util.Scanner;
public class J016 {
    static Scanner in = new Scanner(System.in);
    static int x = in.nextInt(); //first
    static boolean y = in.nextBoolean();//first
    long z = in.nextLong();
    short p = in.nextShort();


    public static int m1(double d) {
        System.out.println("Static method with no return type and no parameters");
        new J016().m2(in.nextFloat());
        return in.nextInt();
    }

    public String m2(float n) {
        System.out.println("Instance method with no return type and one parameter");
        new J016().m3(in.next());
        return in.next();
    }

    public static char m3(String S) {
        System.out.println("Static method with a return type and no parameters");
        new J016().m4(in.next().charAt(0));
        return in.next().charAt(0);  
    }

    public boolean m4(char c) {
        System.out.println("Instance method with a return type and no parameters");
        return in.nextBoolean();
    }

    public static void main(String[] args) {
        System.out.println("Calling m1 now.."+m1(in.nextDouble()));
        System.out.println("Long :"+new J016().z);
        System.out.println("Short :"+new J016().p); 
        System.out.println("int :"+x);
        System.out.println("boolean:"+y);
    }
}