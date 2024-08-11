import java.util.Scanner;
public class Automorphic_number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = x*x;
        if(x%10==y%10){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
        in.close();
    }
}