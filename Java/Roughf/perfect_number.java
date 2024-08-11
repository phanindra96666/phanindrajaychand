import java.util.Scanner;
public class perfect_number {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            int sum=0;
            for(int i=1;i<n;i++){
                if(n%i==0){
                    sum+=i;
                }
            }
                if(n==sum){
                    System.out.println("perfectnumber");
                }
                else{
                    System.out.println("NOt perfect number");
                }
            
            in.close();
    }
  
}
