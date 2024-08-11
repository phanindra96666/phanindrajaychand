import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] arr = {1,2,3,4,5};

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int num = in.nextInt();
        
        for(int i=0;i<num;i++){
            int j,first;
            first = arr[0];
            for(j=0;j<arr.length-1;j++){
                arr[j]=arr[j+1];
            }
            arr[j] = first;
        }

        for(int i = 0; i< arr.length; i++){  
            System.out.print(arr[i] + " ");  
        }  
        in.close();
    }
}