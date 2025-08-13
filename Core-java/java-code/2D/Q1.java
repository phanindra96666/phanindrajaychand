import java.util.Scanner;
class Q1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int target = 5;
        int [] [] arr = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("O/p");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j]==target){
                    System.out.print(i+" "+j);
                }
            }
            System.out.println();
        }
    }
}