import java.util.*;
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
        for(int i=0;i<n;i++){
            System.out.print("Answer :");
            System.out.println(sor[i]);
        }
        in.close();
    }
} 