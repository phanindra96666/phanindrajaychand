import java.util.Scanner;
public class prime_number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count = 0;
        if(n<2){
            System.out.println("Not a prime");
        }
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count+=1;
            }
        }
        if(count<=2){
            System.out.println("TRUE");
        }
        else{
            System.out.println("False");
        }
        in.close();
       
    }
}
