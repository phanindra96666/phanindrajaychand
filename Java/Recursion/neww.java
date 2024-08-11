public class neww {
    public static int calfactorial(int n){
        if(n==0||n==1){
            return 1;
        }
        int N = calfactorial(n-1);
        int result = n*N;
        return result;
    }
    public static void main(String[] args) {
        int n = 5;
        int ans = calfactorial(n);
        System.out.println(ans);
    }
}
