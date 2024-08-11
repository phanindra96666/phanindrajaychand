import java.util.Scanner;
public class phone_number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int len = (int)Math.log10(n)+1;
        
        for(int i=3;i<len;i++){
            n=n/10;
        }
        int di = (int) Math.log(n)+1;
        int temp=0;
        int reuslt = 0;
        for(int i=0;i<di;i++){
            temp = n%10;
            reuslt+=temp;
            n=n/10;
        }
        System.out.println(reuslt);
        in.close();
    }
}
