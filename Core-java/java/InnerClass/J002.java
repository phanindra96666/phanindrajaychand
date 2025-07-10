import java.util.Scanner;
public class J002 {
    public int outerMethod(int base){
        class Inner {
            public int square(int num) {
                return num * num;
            }

            public int cube(int num) {
                return num * num * num;
            }
        }

        Inner inner = new Inner();
        System.out.println("Square: " + inner.square(base));
        System.out.println("Cube: " + inner.cube(base));

        return base;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter base value: ");
        int input = scanner.nextInt();
        J002 obj = new J002();
        obj.outerMethod(input);
        scanner.close();
    }
}