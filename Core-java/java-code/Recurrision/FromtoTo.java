public class FromtoTo{
    public static void isBetween(int n,int m){
        if (n<m-1){
            System.out.println(n+1);
            isBetween(n+1, m);
        }
    }
    public static void main(String[] args) {
        isBetween(9,25);
    }
}