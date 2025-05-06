import java.util.Scanner;
class neww{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        if(n==0){
            System.out.print("Invalid Input.");
        }
        else{
            if(n<0){
                n=n*-1;
            }
            int digit = n*n;
            int  len = (int)Math.log10(n)+1;
            while (n>0) {
                int r = n%10;
                int r1 = digit%10;
                if (r!=r1) {
                    count++;
                }
                n/=10;
                digit/=10;
            }
            if(count==len){
                System.out.print("Automorphic Number");
            }
            else{
                System.out.print("Not an Automorphic Number");
            }
        }
    }
}