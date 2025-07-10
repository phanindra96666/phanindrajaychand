import java.util.Scanner;

public class PowerOfNumber {
    public static int power(int num,int base,int i,int ex){
        if (i<ex){
            return power(num*base, base,i+1,ex);
        }
        else{
            return num;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        int ex = sc.nextInt();
        System.out.println(power(1,base,0,ex));
        sc.close();
    }
}
