import java.util.Scanner;
public class While_Common {
     public void m1(int a,int b){
        int i = a;
        while ( i <= b) {
            if (i%6==0 && i%4==0) {
                System.out.print(i+" ");
            }
            i++;
        }
    }
    public static void main(String[] args) {
        While_Common obj = new While_Common();
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        obj.m1(a, b);
        in.close();
    }
    
}
