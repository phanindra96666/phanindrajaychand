import java.util.Scanner;
public class SumAll {
    public int sum(int n){
        int result = 0;
        for(int i=56;i<153;i++){
            result+=i;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        SumAll obj = new SumAll();
        int n = in.nextInt();
        int result = obj.sum(n);
        System.out.println(result);
        in.close();
    }
}
