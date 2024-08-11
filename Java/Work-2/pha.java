import java.util.*;
public class pha {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int total = 0;
        for(int i=1;i<=n;i++){
            total+=i;
        }
        System.out.print(total);
        in.close();
    }
}
