import java.util.*;
public class count_num {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        int digits = (int) Math.log10(n)+1;
        System.out.println(digits);
        in.close();
    }
}
