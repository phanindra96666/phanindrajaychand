public class fib {
    public static void myfnc(int a,int b,int n){
        if(n==1||n==0){
            return;
        }
        int c = a + b;
        System.out.print(c+" ");  
        myfnc(b, c, n-1);
    }
    public static void main(String[] args) {
        int n = 7;
        int a = 0;
        int b = 1;
        System.out.print(a+" ");
        System.out.print(b+" ");
        myfnc(a,b,n-1);
    }
}