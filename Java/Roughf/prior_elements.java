import java.util.*;
public class prior_elements {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = in.nextInt();
        }
        int count = 1;
        for(int i=0;i<n-1;i++){
            if (arr[i]<arr[i+1]) {
                count++;
            }
        }
        System.out.print("Ans :"+count);
        in.close();
    }
}
