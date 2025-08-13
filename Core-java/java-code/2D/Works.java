import java.util.Arrays;
import java.util.Scanner;
public class Works {

   public static void multi(int[][] A, int[][] B, int r1, int c1, int c2) {

    int[][] C = new int[r1][c2];

    for (int i = 0; i < r1; i++) {
        for (int j = 0; j < c2; j++) {
            C[i][j] = 0;
            for (int k = 0; k < c1; k++) {
                C[i][j] += A[i][k] * B[k][j];
            }
        }
    }
    System.out.println();
    for (int i = 0; i < r1; i++) {
        for (int j = 0; j < c2; j++) {
            System.out.print(C[i][j] + " ");
        }
        System.out.println();
    }
}


    public static void sort(int [][] a,int r,int c){
        int [] sorted = new int[r*c];
        int k = 0 ;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                sorted[k++] = a[i][j];
            }
        }
        Arrays.sort(sorted);
        k = 0;
        for (int i = 0; i < r; i++){
            for (int j = 0; j < c; j++){
                a[i][j] = sorted[k++];
            }
        }
        System.out.println();
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

        
    }

    public static boolean isEqualRowMatrix(int[][] arr) {
            for (int i = 1; i < arr.length; i++) {
                for (int j = 0; j < arr[0].length; j++) {
                    if (arr[i][j] != arr[0][j]) return false;
                }
            }
            return true;
        }

        public static boolean isEqualColumnMatrix(int[][] arr) {
            for (int j = 1; j < arr[0].length; j++) {
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i][j] != arr[i][0]) return false;
                }
            }
            return true;
        }

    public static void isMatch(int[][] a,int r,int c){
        if (isEqualRowMatrix(a)) {
            System.out.println("EqualRow");
        }
        if (isEqualColumnMatrix(a)) {
            System.out.println("EqualColumn");
        }
    }

    public static void diagonalNumber(int[][] a,int r,int c){
        System.out.println("Result:");
        boolean b = true;
        int num = a[0][0];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if (i==j && num != a[i][j]) {
                    b = false;
                    break;
                }
                else if(i!=j && a[i][j]!=0) {
                    b = false;
                    break;
                }

            }
        }
        if (b) {
            System.out.print(num);
        }
        else{
            System.out.print("Not Ok");
        }
    }

    public static void diagonalCheck(int[][] a,int r,int c){
        System.out.println("Result:");
        boolean b = true;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if (i==j && a[i][j]!=1) {
                    b = false;
                    break;
                }
                else if(i!=j && a[i][j]!=0){
                    b = false;
                    break;
                }

            }
        }
        if (b) {
            System.out.print("OK");
        }
        else{
            System.out.print("Not Ok");
        }
    }

    public static void printReverse(int[][] a,int r,int c){
        System.out.println("Result:");
        for(int i=r-1;i>=0;i--){
            for(int j=0;j<c;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }


    public static void sumOf2Diagnol(int[][] a,int r,int c){
        int sumi = 0,sumj=0;
        System.out.println("Result:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(i==j){
                    sumi+=a[i][j];
                }
                if(i+j==c-1){
                    sumj+=a[i][j];
                }
            }
        }
        System.out.println("sum : "+sumi+" "+sumj);
    }

    public static void BigestDiagnolSwap(int[][] a,int r,int c){
        System.out.println("Result:");
        int max = Integer.MIN_VALUE;
        for(int i=0;i<r;i++){
            if (max<a[i][i]) {
                max = a[i][i];
            }    
        }

        for(int i=0;i<r;i++){
            a[i][i] = max;
        }

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void oddAvg(int[][] a,int r,int c){
        int sum = 0,count=0;
        System.out.println("Result:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if (a[i][j]%2==1) {
                    sum+=a[i][j];
                    count++;
                }
            }
        }
        System.out.println("OddAvg : "+sum/count);
    }

    public static void sum(int[][] a,int r,int c,int target){
        int sum = 0;
        System.out.println("Result:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                sum+=a[i][j];
            }
        }
        System.out.println("sum : "+sum);
    }

    public static void second_largest(int[][] a,int r,int c){
        System.out.println("Result:");
        int max = Integer.MIN_VALUE;
        int second_Max = Integer.MIN_VALUE;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if (max<a[i][j]) {
                    second_Max = max;
                    max = a[i][j];
                }
                else if(second_Max<a[i][j]){
                    second_Max = a[i][j];
                }
            }
        }
        System.out.println("Second Max : "+second_Max);
    }

    public static void search(int[][] a,int r,int c,int target){
        System.out.println("Result:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if (a[i][j]==target) {
                    System.out.print(i+""+j);
                }
            }
        }
    }

    public static void print(int[][] a,int r,int c){
        System.out.println("Result:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int [] [] a = new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                a[i][j] = sc.nextInt();
            }
        }

        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int [] [] aa = new int[r1][c1];
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                aa[i][j] = sc.nextInt();
            }
        }
        print(a,r,c);
        // second_largest(a, r, c);
        // sum(a, r, c, r);
        // oddAvg(a, r, c);
        // BigestDiagnolSwap(a,r,c);
        // sumOf2Diagnol(a,r,c); 
        // printReverse(a, r, c);
        // diagonalCheck(a, r, c);
        // diagonalNumber(a, r, c);
        // isMatch(a, r, c);
        // sort(a, r, c);
        multi(a, aa, r1, c, c1);
        sc.close();
    }
}
