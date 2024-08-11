import java.util.Scanner;
public class first {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter total number of vechiles :");
        int n = in.nextInt();
        System.out.print("Enter total number of wheels :");
        int m = in.nextInt();
        int two = ((n*4)-m)/2;
        System.out.print("Two whleers are = "+two+" Four whleers are = "+(n-two));
        in.close();
    }
}