import java.util.Scanner;
public class washing_machine {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n < 0 || n > 7000) {
            System.out.println("INVALID INPUT");
        }
        if (n==0) {
            System.out.println("Time Estimated: 0 minutes");
        }
        if (n>0&&n<=2000) {
            System.out.println("Time Estimated: 25 minutes");
        }
        else if (n>2000 && n<=4000) {
            System.out.println("Time Estimated: 35 minutes");
        }
        else if (n>4000 && n<=7000) {
            System.out.println("Time Estimated: 45 minutes");
        }
        in.close();
    }
}
