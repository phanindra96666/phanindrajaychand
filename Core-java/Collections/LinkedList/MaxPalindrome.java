public class MaxPalindrome {
    public static boolean isPalindrome(int n) {
        int rev = 0;
        int temp = n;
        while (n > 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        return temp == rev;
    }

    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 6, 19};
        int n = arr.length;
        for(int i = 0; i < n; i++) {
            int sum = 0;
            for(int j = i; j < n; j++) {
                sum += arr[j];
                if (j-i+1>2 && isPalindrome(sum)) {
                    for(int k = i;k <= j; k++){
                        System.out.print(arr[k]+" ");
                    }
                    System.out.println();
                    i = j;
                }
            }
        }
    }
}
