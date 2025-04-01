import java.util.Scanner;

public class Print_the_sum {
    public void m1(int a, int b){
        int result = 0;
        for (int i = a; i <= b; i++) {
            if (i%3==0) {
                result+=i;
            }
        }
        System.out.println(result);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Print_the_sum obj = new Print_the_sum();
        int a = in.nextInt();
        int b = in.nextInt();
        obj.m1(a,b);
        in.close();
    }
}
