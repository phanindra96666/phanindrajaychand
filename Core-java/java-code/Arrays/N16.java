public class N16 { 
    public static void main(String[] args) { 
        int arr[] = {4, 5, 0, 1, 2, 3};

        /*
         a[0]=a[a[0]];  //2
         a[1]=a[a[1]];  //3
         a[2]=a[a[2]]; // 4
         a[3]=a[a[3]];  //5
         a[4]=a[a[4]];  //0
         a[5]=a[a[5]];  //1
        */
        
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