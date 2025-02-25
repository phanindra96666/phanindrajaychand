import java.util.Scanner;;
public class NumberPattern {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int rows = in.nextInt();
        
        for (int i = 0; i <rows; i++) {
            for (int j = rows; j > rows - i; j--) {
                System.out.print(j);
            }
            for (int k = 0; k <rows - i; k++) {
                System.out.print(rows - i);
            }
            System.out.println();
        }
        in.close();
    }
}
