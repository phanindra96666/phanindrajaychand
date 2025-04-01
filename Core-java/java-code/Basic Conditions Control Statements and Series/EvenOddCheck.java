import java.util.Scanner;
public class EvenOddCheck {
    public void check(int n){
        int result = 0;
        if (n>100 && n<1000) {
            if (n%2==0) {
                result = n%3;
                System.out.print(result);
            }
            else{
                result = n%2;
                System.out.print(result);
            }
        }
        else{
            System.out.print("invalid input");
        }

    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        EvenOddCheck obj = new EvenOddCheck();
        int n  = in.nextInt();
        obj.check(n);
        in.close();
    }
}
