import java.util.Scanner;
public class reverse_number {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int rev=0;
        while(n>0){
            int digit=n%10;
            rev = rev*10+digit;
            n=n/10;
        }
        System.out.print(rev);
        
            // int num = n;
            // String result="";
            // int a=0;
            // int count=0;
            // while(num!=0){
            //     num=num/10;
            //     count+=1;
            // }
            // for(int i=0;i<count;i++){
            //     a=n%10;
            //     result+=a;
            //     n=n/10;
            // }
            // System.out.print(result);
            in.close();
    }
}
