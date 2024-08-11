import java.util.Scanner;

public class reverse_num {
    public static String myFun(int n){
        String res = "";
        int len = (int)Math.log10(n)+1;
        for(int i=0;i<len;i++){
            int temp = n%10; //12345 take 5
            res = res+temp; //put 5 in string
            n/=10;//remove 5 at the end
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n =in.nextInt();
        String result = myFun(n);
        System.out.println(result);
        in.close();
    }
}