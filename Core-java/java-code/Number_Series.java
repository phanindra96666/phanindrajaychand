import java.util.Scanner;
public class Number_Series {
    public void m1(int n){
        int result = 0;
        for(int i=1;i<n;i++){
           result+=i; // 1 3 6 10 15 21
            System.out.print(result+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Number_Series obj = new Number_Series();
        int n = sc.nextInt();
        obj.m1(n);
        sc.close();
    }
}
