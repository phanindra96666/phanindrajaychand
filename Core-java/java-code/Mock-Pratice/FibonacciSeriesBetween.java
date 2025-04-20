import java.util.Scanner;
public class FibonacciSeriesBetween {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n1 = sc.nextInt(); 
        boolean flag = false;
        int sum = 0;
        float c = 0;
        if (n<0 ||n1<0) {
            System.out.print("Invalid Inputs");
        }
        else{
            int start = Math.min(n,n1);
            int end = Math.max(n,n1);
            int a = 0, b = 1, temp;
            while (a<=end){
                if (a>=start){
                    sum+=a;
                    c++;
                    flag = true;
                } 
                temp = a+b;
                a = b;
                b = temp;
            }
        }
        if (flag) {
            System.out.printf("%.2f",sum/c);
        }
        else{
            System.out.print("No Fibonacci Series Values");
        }
    }
}
