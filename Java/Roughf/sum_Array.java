import java.util.*;
public class sum_Array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        int result=0;
        for(int i=0;i<n;i++){
            result+=arr[i];
        }
        System.out.println(result);
        in.close();
        }
    
}
