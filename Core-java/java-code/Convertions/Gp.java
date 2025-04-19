import java.util.Scanner;
public class Gp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int n2 = sc.nextInt();
        int n = sc.nextInt();
        if (n<0) {
            System.out.print("Invalid inputs");
        }
        else{
            int c = 0;
            int r = n2/a;
            for(int i=1;i<n;i++){
                c++;
                if(c!=1){
                    System.out.print(", ");
                }
                System.out.print(a*((int)Math.pow(r,i)));
            }
        }
        sc.close();
    }
}
//GP
//5->1st
//15->2nd
//6->n
