import java.util.Scanner;
public class phani {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int [] arr = new int[n];
         for(int i=0;i<n;i++){
            arr[i] = in.nextInt();
        }
        in.close();
        int max = Integer.MIN_VALUE;
        int count =0;

        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max = arr[i];
                count++;
            }
        }
        System.out.println("The count is : "+count);
    }
}