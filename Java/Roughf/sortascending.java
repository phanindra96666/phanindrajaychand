import java.util.*;
import java.util.Collections;
public class sortascending {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Integer [] sor = new Integer[n];
        for(int i=0;i<n;i++){
            sor[i] = in.nextInt();
        }      
        //Arrays.sort(sor);
        Arrays.sort(sor,Collections.reverseOrder()); 
        System.out.print("Answer :");
        for(int i=0;i<n;i++){
            System.out.print(sor[i]+" ");
        }
        in.close();
    }
} 