import java.util.LinkedList;
//import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) { 
        int [] arr = {10,5,7,10,7,6,4,5,7,11,7,11};
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int [] arr = new int[n];
        // for(int i=0;i<n;i++){
        //     arr[i] = sc.nextInt();
        // }
        LinkedList<Integer> ll = new LinkedList<>();
        for(int i=0;i<arr.length;i++){
            int t = ll.indexOf(arr[i]);
            if (t == -1) {
                ll.add(arr[i]);
            }
            else{
                ll.add(t,arr[i]);
            }
        }
        System.out.println(ll);   
    }
}
