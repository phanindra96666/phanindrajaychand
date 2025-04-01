import java.util.Scanner;
public class Untill_Odd {
    public static void main(String[] args) {
        int count = 1;
        while (true){
            count++;
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            if (n%2==0) {
                continue;
            }
            if (n%2!=0) {
                break;
            }
            in.close();
            System.out.println("count"+count);
        }
    }
}