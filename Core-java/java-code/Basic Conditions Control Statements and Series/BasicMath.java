import java.util.Scanner;
public class BasicMath {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        String s = in.next();
        switch (s) {
            case "+":
                System.out.println(a+b);
                break;
            case "-":
                System.out.println(a-b);
                break;

            case "*":
                System.out.println(a*b);
                break;

            case "/":
                System.out.println(a/b);
                break;

            case "%":
                System.out.println(a%b);
                break;
            default:
                System.out.println("Enter valid Number");
        }
        in.close();
    }
}
