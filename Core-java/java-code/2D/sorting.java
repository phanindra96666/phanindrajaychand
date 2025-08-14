import java.util.Scanner;

class sorting {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        int r = obj.nextInt();
        int c = obj.nextInt();

        int a[][] = new int[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j] = obj.nextInt();
            }
        }

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                for (int y = j + 1; y < c; y++) { 
                    if (a[i][y] < a[i][j]) {
                        int temp = a[i][j];
                        a[i][j] = a[i][y];
                        a[i][y] = temp;
                    }
                }
                for (int x = i + 1; x < r; x++) { 
                    for (int y = 0; y < c; y++) { 
                        if (a[x][y] < a[i][j]) { 
                            int temp = a[i][j];
                            a[i][j] = a[x][y];
                            a[x][y] = temp;
                        }
                    }
                }
            }
        }
        System.out.println("Result :");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}