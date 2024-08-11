import java.util.Scanner;
public class add_two_without_another_varible {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = 1;
        int b = 2;

        b = a+b; //3
        a = b-a; //2
        b = b-a; //1
        System.out.println(a);
        System.out.println(b);
        in.close();
    }
}