public class Sliding_Window {
    public static void main(String[] args) {
        int [] arr = {10,20,30,6,19,30};
        // for(int i=0;i<=arr.length-4;i++){
        //     for(int j=i;j<i+4;j++){
        //         System.out.print(arr[j]+" ");
        //     }
        //     System.out.println();
        // }
        int n = arr.length;
        boolean b = true;
        for(int i = n-1;i>=0 && b;i--){ //k value decresing order
            for(int j=0;i+j<n;j++){ // j<=n-i ==>i+j<=n
                int sum = 0;
                for(int k=j;k<=i+j;k++){ //k<=j+i
                    sum+=arr[k];
                    //System.out.print(arr[k]+" ");
                }
                if (isPalindrome(sum)) {
                    b = false;
                    System.out.println("Sum: "+sum);
                    for(int k=j;k<=i+j;k++){
                        System.out.print(arr[k]+" ");
                    }
                    System.out.println();
                }
                
                //System.out.println();
            }
        }
    }

    private static boolean isPalindrome(int sum) {
       int res = sum;
       int rev = 0;
       while(sum>0){
            int r = sum%10;
            rev = rev*10+r;
            sum/=10;
        }
        return res == rev;
    }
}
