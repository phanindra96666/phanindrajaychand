import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int [] a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        int k = (int)Math.pow(2,n);
        for(int i=1;i<k;i++){
            int sum = 0;
            String w = "";
            String bin = binary(i);
            int index  = 0;
            for (int j = bin.length()-1; j >= 0; j--) {
                if (bin.charAt(j) == '1') {
                    //System.out.print(a[index]+" ");
                    w = w+a[index]+" ";
                    sum +=a[index];
                }
                if (sum == 60) {
                    System.out.println(w);
                }
                index++;
            }
            //System.out.println();
    }
}

    private static String binary(int n) {
       String bin = "";
       while (n>0) {
        bin = n%2+bin;
        n/=2;
       }
       return bin;
    }
}