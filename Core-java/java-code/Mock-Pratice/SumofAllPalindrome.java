import java.util.Scanner;
public class SumofAllPalindrome {
    static boolean isPalindrome(int n){
        int copy = n;
        int result=0;
        while (n>0) {
            result = result*10+n%10;
            n/=10;
        }
        return result == copy;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = 0;
        if(a==0 || b==0){ 
            System.out.print("INVALID Inputs");
        }
        else{
            int n = Math.min(Math.abs(a), Math.abs(b));
            int n1 = Math.max(Math.abs(a), Math.abs(b));
            boolean flag = false;
            boolean print = true;
            int result = 0;
            int c = 0;
            for (int i=n+1;i<n1;i++) {
                if (isPalindrome(i)){
                    if (c==0) {
                        System.out.print("Sum of Alternative Palindrome Numbers between the "+n+" and "+n1+" is ");
                    }
                    c++;
                    flag = true;
                    if(print) {
                        if (c!=1){
                            System.out.print(" + ");
                        }
                        System.out.print(i);
                        sum+=i;
                    }
                    print = !print;
                }
            }
            if (flag) {
                System.out.print(" = "+sum+".");
            }
            else{
                System.out.print("No Palindrome Values.");
            }

        }
    }
}
