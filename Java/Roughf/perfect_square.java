import java.util.Scanner;
public class perfect_square {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int x  = (int)Math.sqrt(n);
        if(x*x==n){
            System.out.println("Perfect square");
        }
        else{
            System.out.println("Not a perfect square");
        }
        in.close();
    }
}    