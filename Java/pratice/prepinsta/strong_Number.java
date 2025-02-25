package prepinsta;
public class strong_Number {
    public static int facto(int n){
        int fact = 1;
        for(int i=1;i<=n;i++){
            fact*=i;
        }
        return fact;
    }
    public static boolean check(int n){
        int digit, sum = 0;
        boolean flag = false;
        int temp = n;
        while (temp!=0) {
            digit = temp%10;
            sum += facto(digit);
            temp/=10;
        }
        if (sum == n) {
            flag = true;
        }
        else{
            flag = false;
        }
        return flag;
    }

    public static void main(String[] args) {
        int n = 145;
        if (check(n)) {
            System.out.print("true");
        }
        else{
            System.out.print("False");
        }
    }
}