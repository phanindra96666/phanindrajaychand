import java.util.Scanner;

public class While_Range_Between {
    public void m1(int a,int b){
        int i = a;
        while ( i <= b) {
            if (i%7==0) {
              System.out.print(i+" ");
            }
            i++;
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        While_Range_Between obj = new While_Range_Between();
        int a = in.nextInt();
        int b = in.nextInt();
        obj.m1(a,b);
        in.close();
    }
}
    
