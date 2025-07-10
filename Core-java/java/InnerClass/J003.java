import java.util.Scanner;
public class J003 {
    public int outerMethod(int x) {
        System.out.println("Outer Method: " + x);
        return x;
    }
    class InnerClass {
        public int middleMethod(int y) {
            System.out.println("Middle Method: " + y);
            class InnerMostOne {
                public int doubleValue(int a) {
                    return a * 2;
                }
            }
            class InnerMostTwo {
                public int tripleValue(int b) {
                    return b * 3;
                }
            }
            InnerMostOne obj1 = new InnerMostOne();
            InnerMostTwo obj2 = new InnerMostTwo();
            System.out.println("Double: " + obj1.doubleValue(y));
            System.out.println("Triple: " + obj2.tripleValue(y));
            return y;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter integer: ");
        int val = scanner.nextInt();

        J003 outer = new J003();
        outer.outerMethod(val);

        J003.InnerClass inner = new J003().new InnerClass();
        inner.middleMethod(val);
        scanner.close();
    }
    
}
