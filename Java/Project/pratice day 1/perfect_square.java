import java.util.Scanner;
public class perfect_square {
    public static void main(String argss[]){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int x = (int)Math.sqrt(n);
        if(x*x==n){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
        in.close();
    }
}
