import java.util.Arrays;

public class InsertionSort {
    public static void insertionSort(int arr[]){ 
        int n = arr.length;
        int j;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            for(j=i-1;j>=0;j--){ 
                if (arr[j]>key) { 
                    arr[j+1] = arr[j];
                } 
                else{ 
                    break;
                } 
            } 
            arr[j+1] = key;
            System.out.println("i = "+i+"  "+Arrays.toString(arr));
        }
    }
    public static void main(String[] args) {
        int [] arr = {5,8,2,9,10,4,7};
        insertionSort(arr);
        for(int num : arr){
            System.out.print(num+" ");
        }
    }
}
