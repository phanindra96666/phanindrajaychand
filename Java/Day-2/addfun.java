import java.util.*;
public class addfun {
    public static int addTwoNum(int a,int b){
    int sum=a+b;
    return sum;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
            int a = in.nextInt();
            int b = in.nextInt();
            int sum=addTwoNum(a,b);
            System.out.print("The sum is:"+sum);
            in.close();
    }
}