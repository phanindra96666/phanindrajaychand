public class calpow {
    public static int calpower(int x,int n){
        if (n==0) {
            return 1;
        }
        if (x==0) {
            return 0;
        }
        int cal = calpower(x, n-1); 
        int pow = x*cal;
        return pow;
    }
    public static void main(String[] args) {
        int x=2;
        int n=5;
        int res = calpower(x, n);
        System.out.println(res);
    }
}
