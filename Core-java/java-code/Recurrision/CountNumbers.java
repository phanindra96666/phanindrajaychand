import java.util.Scanner;
public class CountNumbers {
    public static int count(int n,int count){
        if (n>0) {
            return count(n/=10,count+1);
        }
        else{
            return count;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(count(n,0));
        sc.close();
    }
}
