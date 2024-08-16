import java.util.*;
public class table {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i=1;i<=10;i++){
            int total=n*i;
            System.out.print(n+"x"+i+"="+total);
            System.out.println();
        }
        in.close();
    }
}
