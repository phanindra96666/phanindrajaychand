import java.util.Scanner;

public class J008 {
    static Scanner in = new Scanner(System.in);
    static J008 obj = new J008();

    public String m1(int num) {
        return in.next();
    }
    public String m2(boolean condition) {
        return obj.m1(in.nextInt());
    }

    public boolean m3(float value) {

        return in.nextBoolean();
    }

    public boolean m4(char character) {
        return obj.m3(in.nextFloat());
    }

    public static void main(String[] args) {

        System.out.println("Enter a boolean value for method m2 (true/false):");
        boolean inputBoolean = in.nextBoolean();
        
        System.out.println("Enter a char value for method m4:");
        char inputChar = in.next().charAt(0);

        String resultM2 = obj.m2(inputBoolean);
        boolean resultM4 = obj.m4(inputChar);

        System.out.println("Result of m2: " + resultM2);
        System.out.println("Result of m4: " + resultM4);

        in.close();
    }
}
