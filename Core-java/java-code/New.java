import java.util.Scanner;

public class New {
    public static void main(String[] args) { //2 3 4 9 8 27 16 81
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int powerOfTwo = 2, powerOfThree = 3;
        for (int i = 2; i < n; i++) {
            if (i % 2 == 0) {
                System.out.print(powerOfTwo + " ");
                powerOfTwo *= 2;
            } else {
                System.out.print(powerOfThree + " ");
                powerOfThree *= 3;
            }
        }
        in.close();
    }
}
