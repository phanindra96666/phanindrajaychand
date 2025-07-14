public class N16 { 
    public static void main(String[] args) { 
        int arr[] = {4, 5, 0, 1, 2, 3};
        int n = arr.length;

        for (int i = 0; i < n; i++) { 
            arr[i] = arr[i] + (arr[arr[i]] % n) * n;
        } 

        for (int i = 0; i < n; i++) { 
            arr[i] = arr[i] / n;
        } 

        for (int num : arr) { 
            System.out.print(num + " ");
        } 
    } 
} 