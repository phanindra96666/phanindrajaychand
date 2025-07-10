import java.util.Scanner;
public class OneArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println();
        for(int i=0;i<n;i++){
            int d = 0;
            for(int j=0;j<i;j++){
                if(arr[i]==arr[j]){
                    d++;
                    break;
                }
            }
            if(d==0){
                for(int j=i;j<n;j++){
                    if(arr[i]==arr[j]){
                        d++;
                    }
                }
                System.out.println(arr[i]+" -> "+d);
            }
        }
    }
}