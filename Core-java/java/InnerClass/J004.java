import java.util.Scanner;
public class J004 {
    public int instanceMethod(int num) {
        return num + 5;
    }
    static class StaticNested {
        public int nestedMethod(int num) {
            return num * 5;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int input = scanner.nextInt();

        J004 obj = new J004();
        System.out.println("Instance Method Result: " + obj.instanceMethod(input));

        J004.StaticNested nested = new J004.StaticNested();
        System.out.println("Static Nested Method Result: " + nested.nestedMethod(input));
        scanner.close();
    }
}