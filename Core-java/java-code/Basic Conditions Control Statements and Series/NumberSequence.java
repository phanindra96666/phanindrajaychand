import java.util.Scanner;
public class NumberSequence {
    public static void generateSequence(int start, int middle, int end) { // 5 8 3 / 5 8 10 / 10 7 11
        if (start <= middle) {
            for (int i = start; i <= middle; i++) {
                System.out.print(i + " ");
            }
            if (middle>end) {
                for (int i = middle - 1; i >= end; i--) {
                    System.out.print(i + " ");
                }
            }
            else{
                for (int i = middle + 1; i <= end; i++) {
                    System.out.print(i + " ");
                }
            }
        } else {
            for (int i = start; i >= middle; i--) {
                System.out.print(i + " ");
            }
            for (int i = middle + 1; i <= end; i++) {
                System.out.print(i + " ");
            }
            if (middle>end) {
                for (int i = middle - 1; i >= end; i--) {
                    System.out.print(i + " ");
                }
            }
        }
        System.out.println();  
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three integers: ");
        int start = sc.nextInt();
        int middle = sc.nextInt();
        int end = sc.nextInt();
        generateSequence(start, middle, end);
        sc.close();
    }
}
