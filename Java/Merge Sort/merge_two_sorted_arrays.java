public class merge_two_sorted_arrays {
    public static void main(String[] args) {
        int [] a = {1,2,3,0,0,0};
        int n = 3;
        int [] b = {2,5,6};
        int m = 3;
        int x = 0,y = 0,z = 0;
        int [] merge = new int[n+m];
        while (x<n && y<m) {
            if (a[x]<=b[y]) {
                merge[z++]=a[x++];
            }
            else{
                merge[z++]=b[y++];
            }
        }
        while (x<n) {
            merge[z++]=a[x++];
        }
        while (y<m) {
            merge[z++]=b[y++];
        }
        for (int i = 0; i < m+n; i++) {
            a[i]=merge[i];
            System.out.print(a[i]+" ");
        }
    }
}