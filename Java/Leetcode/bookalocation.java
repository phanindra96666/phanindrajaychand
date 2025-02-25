public class bookalocation {
    public static int ischeck (int arr[],int m,int n){
        if (m > n){
            return -1;
        }
        int sum = 0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        int start = 0 , end = sum , ans = -1;
        while (start<=end){
            int mid = start+(end-start)/2;
            if(isVaild(arr,n,m,mid)){
                ans = mid;
                end = mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return ans;
    }
    public static boolean isVaild(int[] arr, int n, int m, int midAlloted) {
        int stu = 1,pages=0;
        for (int i = 0; i < n; i++) {
            if (arr[i]>midAlloted) {
                return false;
            }
            if (arr[i]+pages>midAlloted) {
                stu++;
                pages+=arr[i];
                if (stu > m) {
                    return false;
                }
            }
            else {
                pages += arr[i]; 
            } 
        }

        return stu > m ? false:true;
    }
    public static void main(String[] args) {
        int arr[] = {2,1,3,4};
        int m = 2;
        int n = 4;
        System.out.print(ischeck(arr, m, n));
    }
}