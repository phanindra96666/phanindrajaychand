import java.util.Scanner;
public class entring_array {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }

        System.out.print("[");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i]);
            if (i < n - 1){
                System.out.print(", ");
            }
        }
        System.out.println("]");
        in.close();
    }
}