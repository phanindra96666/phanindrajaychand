import java.util.Scanner;
public class Palindrome {
    public static int isPalindrome(int n,int rev){
        if (n == 0) {
            return rev;
        }
        return isPalindrome(n / 10, rev * 10 + n % 10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n==isPalindrome(n,0)) {
            System.out.println("Palindrome");
        }
        else{
            System.out.println("No");
        }
        sc.close();
    }
}
