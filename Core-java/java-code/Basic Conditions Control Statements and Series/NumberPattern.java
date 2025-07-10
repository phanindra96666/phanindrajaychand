import java.util.Scanner;
public class NumberPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <=n; i++) {
            int t = i;
            for(int j=1;j<=i;j++){
                if(j%2==0){
                    System.out.print(t+" ");
                    t = t+(i-j)*2;
                }
                else{
                    System.out.print(t+" "); 
                    t = t+(n-i)*2+1;
                }
            }
            System.out.println();
            sc.close();
        }
    }
}
