import java.util.Arrays;

public class SelectionSort {
    public static void selectionSort(int[] arr) {
            int n = arr.length;
            for (int i = 0; i < n - 1; i++) {
                int minIndex = i;
                for (int j = i + 1; j < n; j++) {
                    if (arr[j] < arr[minIndex]) {
                        minIndex = j;
                    }
                }
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
                System.out.println("i = "+i+"  "+Arrays.toString(arr));
            }
    }
    
    public static void main(String[] args) {
        int [] arr = {64,34,25,12,22,11,90};
        selectionSort(arr);
        for(int n : arr){
            System.out.print(n+" ");
        }
    }
}
