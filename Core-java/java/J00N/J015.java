// Create a java application where we have one class it contains two static 
// and two non static methods alternatively with parameter and return type
// then invoke all these methods by implementing method to method calling 
// approach provide dynamic inputs and do not create our class object 

import java.util.Scanner;
public class J015 {
    static Scanner in = new Scanner(System.in);

    public static int m1(double d) {
        System.out.println("Static method with no return type and no parameters");
        new J015().m2(in.nextFloat());
        return in.nextInt();
    }

    public String m2(float n) {
        System.out.println("Instance method with no return type and one parameter");
        new J015().m3(in.next());
        return in.next();
    }

    public static char m3(String S) {
        System.out.println("Static method with a return type and no parameters");
        new J015().m4(in.next().charAt(0));
        return in.next().charAt(0);  
    }

    public boolean m4(char c) {
        System.out.println("Instance method with a return type and no parameters");
        return in.nextBoolean();
    }

    public static void main(String[] args){
        System.out.println(m1(in.nextDouble()));
    }
}