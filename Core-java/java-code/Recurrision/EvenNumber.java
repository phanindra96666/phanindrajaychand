import java.util.Scanner;
public class EvenNumber {
    public static void isEven(int n,int m){
        if (n<m) {
            if (n%2==0) {
                System.out.println(n);
            }
            isEven(n+1, m);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        isEven(5, 15);
        sc.close();
    }
}
