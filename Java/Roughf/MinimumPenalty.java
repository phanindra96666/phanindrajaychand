import java.util.*;
public class MinimumPenalty {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        Arrays.sort(arr);
        int penalty = 0;  
        for(int i=1;i<arr.length;i++){
            penalty+=Math.abs(arr[i]-arr[i-1]);
        }
        System.out.println("result = "+penalty);
        in.close();
    }
}


