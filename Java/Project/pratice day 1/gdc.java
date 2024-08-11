import java.util.Scanner;
public class gdc {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int min = num1;
        if(num1>num2){
            min=num2;
        }
        int gcd=1;
        for(int i=1;i<=min;i++){
            if((num1%i==0) && (num2%i==0)){
                gcd=i;

            }
        }
        System.out.print(gcd);
        in.close();
    }
}
