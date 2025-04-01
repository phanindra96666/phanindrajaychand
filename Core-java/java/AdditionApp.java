import java.util.Scanner;
public class AdditionApp {
    public int m1(int num1, int num2) {
        return num1 + num2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AdditionApp obj = new AdditionApp();
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int result = obj.m1(num1, num2);
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + result);
        sc.close();
    }
}
