import java.util.*;
public class two_string_matches {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your length:");
        int n = in.nextInt();
        int [] arr1 = new int[n];
        int [] arr2 = new int[n];
        for(int i=0;i<n;i++){
            arr1[i]=in.nextInt();
        }
        System.out.println("second");
        for(int i=0;i<n;i++){
            arr2[i]=in.nextInt();
        }
        boolean status =Arrays.equals(arr1,arr2);
        if(status){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        in.close();
    }
}
