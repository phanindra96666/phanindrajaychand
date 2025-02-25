import java.util.Scanner;
public class rev_array {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       int n = in.nextInt();
       int [] arr = new int[n];

       for(int i=0;i<n;i++){
        arr[i]=in.nextInt();
       }

       int size = arr.length;
       for(int i=size-1;i>=0;i--){
        System.out.print(arr[i]+" ");
       }
       in.close();
    }
}