import java.util.Scanner;
public class Number_Series2 {
    public static void main(String[] args) { //2 3 4 9 8 27 16 81
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i=2;i<n;i++){
            if (i%2==0) {
                System.out.print((int)Math.pow(2, i/2)+" ");
            }
            else{
                System.out.print((int)Math.pow(3, i/2)+" ");
            }
        }
        in.close();
    }
}
// 2 3 4 9 8 27 16 81
