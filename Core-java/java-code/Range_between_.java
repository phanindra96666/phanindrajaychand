import java.util.Scanner;
public class Range_between_ {
    public void m1(int a,int b){
        for (int i = a; i <= b; i++) {
            if (i%7==0) {
              System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Range_between_ obj = new Range_between_();
        int a = in.nextInt();
        int b = in.nextInt();
        obj.m1(a,b);
        in.close();
    }
}