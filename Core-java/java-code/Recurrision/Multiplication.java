import java.util.Scanner;
public class Multiplication {
    public static void multiplicationTable(int n,int i){
        if (i<=10) {
            System.out.println(n+" * "+i+" = "+(n*i));
            multiplicationTable(n,i+1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        multiplicationTable(sc.nextInt(),1);
        sc.close();
    }
}