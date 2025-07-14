import java.util.Scanner;
public class First{
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        int copy = n;
        int digit = (int)Math.log10(n)+1;
        int [] arr = new int[digit];
        for(int i=digit-1;i>=0;i--){
            arr[i] = n%10;
            n/=10;
        }
        int sum = 0;
        boolean f = false;
        while (sum<copy) {
            sum = 0;
            for (int i = 0; i < digit; i++) {
                sum += arr[i];
            }
             if (sum == copy) {
                f = true;
                break;  
            }
            for (int i = 0; i < digit - 1; i++) {
                arr[i] = arr[i + 1];
            }
            arr[digit - 1] = sum;
        }
        if (f) {
            System.out.print("Keith number"); 
        }
        else{
            System.out.print("Not a Keith number");
        }
        sc.close();
    }
}