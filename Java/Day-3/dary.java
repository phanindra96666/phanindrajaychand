import java.util.*;
public class dary {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int row = in.nextInt();
        int col = in.nextInt();
        int[][] dArray = new int[row][col];

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                dArray[i][j] = in.nextInt();
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(dArray[i][j]+" ");
            }
            System.out.println();
        }
    }
}
