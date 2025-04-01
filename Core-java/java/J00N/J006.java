import java.util.Scanner;

public class J006{
    static Scanner sc = new Scanner(System.in);
    public int addition(int a, int b) {
        return a + b;
    }

    public int subtraction(int a, int b) {
        return a - b;
    }

    public static int multiplication() {
        J006 obj = new J006();
        int sum = obj.addition(sc.nextInt(), sc.nextInt());  
        int diff = obj.subtraction(sc.nextInt(), sc.nextInt());
        return sum * diff;
    }

    public static void main(String[] args) {
        int result = multiplication();
        System.out.println(result);
    }
}
