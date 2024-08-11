import java.util.Scanner;
public class roughf {
    public static void myFnc(int[] arr){
        System.out.print("new:");
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        myFnc(arr);
        in.close();
    }
}
