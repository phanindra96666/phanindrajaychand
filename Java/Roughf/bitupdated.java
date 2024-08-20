import java.util.Scanner;
public class bitupdated {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int oper = in.nextInt();
        int n=4;
        int pos=1;
        int bitmask=1<<pos;
        if (oper==1) {
            int result = bitmask | n;
            System.out.println(result);
        }
        else{
        int newBitmask = ~(bitmask);
        int result2=newBitmask&n;
        System.out.println(result2);
        } 
        in.close();  
    }
}
