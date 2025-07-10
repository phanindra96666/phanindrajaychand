import java.util.Arrays;
public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int c = 0;
            for (int j = 0; j < n - i - 1; j++) { 
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    c++;
                }
            }
            if(c==0){
                break;
            }
            System.out.println("i = "+i+"  "+Arrays.toString(arr));
        }
    }

    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Original array:");
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
        bubbleSort(arr);
        System.out.println("Sorted array:");
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
