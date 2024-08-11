import java.util.Scanner;
public class nt {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int result=0;
        for(int i=0;i<n;i++){
            result+=i;
        }
        System.out.println(result);
        in.close();
    }
}