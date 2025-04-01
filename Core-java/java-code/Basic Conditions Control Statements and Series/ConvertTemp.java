import java.util.Scanner;
public class ConvertTemp {
     public int converter(int n){
        int result = (n*9/5)+32;
        return result;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ConvertTemp obj = new ConvertTemp();
        int result = obj.converter(n);
        System.out.println(result);
        in.close();
    }
}
