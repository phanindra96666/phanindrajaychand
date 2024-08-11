import java.util.Scanner;

public class rowcol {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int row = in.nextInt();
        int col = in.nextInt();
        int arr_row[][] = new int[row][col];

        // Reading the array elements
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr_row[i][j] = in.nextInt();
            }
        }

        // Printing the array elements
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr_row[i][j] + " ");
            }
            System.out.println();
        }

        in.close(); // Close the Scanner after use
    }
}
